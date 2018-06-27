--이슈
SELECT *
FROM redmine.issues;

SELECT *
FROM redmine.issue_categories;

--이슈 진행사항
SELECT *
FROM redmine.issue_statuses;

--연관 이슈
SELECT *
FROM redmine.issue_relations;

--이슈 종류
SELECT *
FROM redmine.trackers;

UPDATE redmine.issues
set parent_id = '19122'
where id = '19121';

CREATE TABLE redmine.issues
(
  id integer NOT NULL DEFAULT nextval('redmine.issues_id_seq'::regclass),
  tracker_id integer NOT NULL,  --이슈종류
  project_id integer NOT NULL, --프로젝트 : 17
  subject character varying(255) NOT NULL DEFAULT ''::character varying,
  description text,
  due_date date,
  category_id integer,
  status_id integer NOT NULL,
  assigned_to_id integer,
  priority_id integer NOT NULL,
  fixed_version_id integer,
  author_id integer NOT NULL,
  lock_version integer NOT NULL DEFAULT 0,
  created_on timestamp without time zone,
  updated_on timestamp without time zone,
  start_date date,
  done_ratio integer NOT NULL DEFAULT 0,
  estimated_hours numeric(11,0),
  parent_id integer,
  root_id integer,
  lft integer,
  rgt integer,
  is_private boolean NOT NULL DEFAULT false,
  closed_on timestamp without time zone,
  CONSTRAINT issues_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);

INSERT INTO 
    redmine.issues (tracker_id, project_id, subject, status_id, priority_id,author_id,lock_version, done_ratio, is_private, lft, rgt, created_on, updated_on )
VALUES('6', '72', 'insert Test22', '1', '2', '500', '2', '0', false, '1', '2', now(), now());

--asignee, start, end
;

create sequence redmine.sr_id_seq;

select currval('redmine.sr_id_seq');

;
CREATE TABLE redmine.service_requset
(
  id integer NOT NULL DEFAULT nextval('redmine.sr_id_seq'::regclass),
  system_name character varying(100) NOT NULL DEFAULT ''::character varying,
  mr_version character varying(20) NOT NULL DEFAULT ''::character varying,
  status character varying(20) NOT NULL DEFAULT ''::character varying,
  sr_id character varying(20) NOT NULL DEFAULT ''::character varying,
  subject character varying(255) NOT NULL DEFAULT ''::character varying,
  reg_date date,
  CONSTRAINT sr_pkey PRIMARY KEY (id)
 )

ALTER TABLE redmine.service_request
ADD spec text;

;
 insert into  redmine.service_requset (system_name, mr_version, status, sr_id, subject)
 values ('G-Server','MR 5.1차','진행중','2018-0033','FCM 고객 응답률 체크');

 select *
 from redmine.service_request;

--MR Version 조회
 select distinct(mr_version)
 from redmine.service_request
 order by mr_version asc;

 --MR Verson 별 SR List
 SELECT *
 FROM redmine.service_request
 WHERE mr_version = 'MR 6차';
 
