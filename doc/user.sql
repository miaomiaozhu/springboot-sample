-------------------------------------------------------
-- Export file for user C##RUOYI@127.0.0.1:1521/ORCL --
-- Created by Jumy on 2020/10/3, 20:02:29 -------------
-------------------------------------------------------

create table TEST_USER
(
  user_id      VARCHAR2(20) not null,
  name         VARCHAR2(20),
  age          NUMBER,
  birth_date   VARCHAR2(20),
  native_place VARCHAR2(20),
  memo         BLOB,
  create_by    VARCHAR2(20),
  create_time  DATE,
  update_by    VARCHAR2(20),
  update_time  DATE,
  id_number    VARCHAR2(20)
)
;
comment on column TEST_USER.user_id
  is '����';
comment on column TEST_USER.name
  is '����';
comment on column TEST_USER.age
  is '����';
comment on column TEST_USER.birth_date
  is '��������';
comment on column TEST_USER.native_place
  is '����';
comment on column TEST_USER.memo
  is '��ע';
comment on column TEST_USER.create_by
  is '������';
comment on column TEST_USER.create_time
  is '����ʱ��';
comment on column TEST_USER.update_by
  is '������';
comment on column TEST_USER.update_time
  is '����ʱ��';
comment on column TEST_USER.id_number
  is '���֤��';
alter table TEST_USER
  add constraint TEST_USER_PK primary key (USER_ID);


