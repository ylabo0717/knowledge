-- 自動マイグレーションの機能は使わない（v1.12のまま)
ALTER TABLE SURVEYS DROP COLUMN IF EXISTS LOGIN_NECESSARY;
ALTER TABLE SURVEYS ADD COLUMN LOGIN_NECESSARY integer DEFAULT 0;

comment on column SURVEYS.LOGIN_NECESSARY is 'アンケート回答にログインが必須';