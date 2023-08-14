const { series, src, dest, task } = require("gulp");
const usemin = require("gulp-usemin");
const uglify = require("gulp-uglify");
const minifyHtml = require("gulp-minify-html");
const minifyCss = require("gulp-minify-css");
const rev = require("gulp-rev");
const replace = require("gulp-replace");
const eslint = require("gulp-eslint");

task("min", () => {
  return src(["src/main/webapp/WEB-INF/views/**/*.jsp"])
    .pipe(
      replace('href="<%= request.getContextPath() %>/bower', 'href="/bower')
    )
    .pipe(replace('href="<%= request.getContextPath() %>/css', 'href="/css'))
    .pipe(replace('src="<%= request.getContextPath() %>/bower', 'src="/bower'))
    .pipe(replace('src="<%= request.getContextPath() %>/js', 'src="/js'))
    .pipe(replace("<%= request.getContextPath() %>/EasyWizard", "/EasyWizard"))
    .pipe(
      usemin({
        css: [rev],
        htmlmin: [
          () => {
            return minifyHtml({ empty: true });
          },
        ],
        js: [uglify, rev],
        inlinejs: [uglify],
        inlinecss: [minifyCss, "concat"],
        outputRelativePath: "../../",
      })
    )
    .pipe(
      replace(
        "var _LOGGING_NOTIFY_DESKTOP = true;",
        "var _LOGGING_NOTIFY_DESKTOP = false;"
      )
    )
    .pipe(
      replace('href="/bower', 'href="<%= request.getContextPath() %>/bower')
    )
    .pipe(replace('href="/css', 'href="<%= request.getContextPath() %>/css'))
    .pipe(replace('src="/bower', 'src="<%= request.getContextPath() %>/bower'))
    .pipe(replace('src="/js', 'src="<%= request.getContextPath() %>/js'))
    .pipe(replace('href="bower', 'href="<%= request.getContextPath() %>/bower'))
    .pipe(replace('href="css', 'href="<%= request.getContextPath() %>/css'))
    .pipe(replace('src="bower', 'src="<%= request.getContextPath() %>/bower'))
    .pipe(replace('src="js', 'src="<%= request.getContextPath() %>/js'))
    .pipe(dest("target/knowledge/WEB-INF/views/"));
});

const copyTasks = [
  "bootswatch",
  "bootswatch2",
  "highlightjs",
  "font-awesome",
  "flag-icon-css",
  "html5shiv",
  "respond",
  "MathJax",
  "emoji-parser",
  "free-file-icons",
  "diff2html",
  "jsdiff",
  "jspdf",
  "pdfthema",
  "mermaid",
];

copyTasks.forEach((taskName) => {
  task(`copy:${taskName}`, () => {
    return src([`src/main/webapp/bower/${taskName}/**/*`]).pipe(
      dest(`target/knowledge/bower/${taskName}`)
    );
  });
});

const allCopyTasks = copyTasks.map((taskName) => `copy:${taskName}`);

task("copy", series(...allCopyTasks));

task("check", () => {
  return src(["src/main/webapp/js/slide.js"])
    .pipe(eslint())
    .pipe(eslint.format())
    .pipe(eslint.failAfterError());
});

task("default", series("min", "copy", "check"));
