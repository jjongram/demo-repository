select * from NETFLIX n;

insert into NETFLIX (VIDEO_NAME, VIEW_CNT) values ('시그널', 42);

rollback;
insert into NETFLIX values ('나의 아저씨', '드라마', 30, sysdate);


insert into NETFLIX values ('응답하라 1988', '드라마', 35, sysdate-30);

insert into NETFLIX values ('이태원 클라스', '드라마', 30, sysdate-40);
insert into NETFLIX values ('미스터 선샤인', '드라마', 22, sysdate-300);

commit;
UPDATE NETFLIX SET CATEGOFY = '드라마', REG_DATE = TO_DATE('20210101', 'YYYYMMDD') WHERE VIDEO_NAME = '시그널';