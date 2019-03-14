# Git





[TOC]



# 0. Git 이란?
```bash
 1) SVN과 마찬가지로 소스코드의(프로젝트) 효율적인 관리를 위한 형상관리도구(Configuration 
    Management Tool)중 하나다.
    SVN? -> SubVersionN의 줄임말로 형상관리도구 중 하나다.
 
 2) git과 SVN 다른점 
  - SVN은 집중식 버전 관리 시스템(Centeralized Version Control system:CVCS)
    CVCS는 관리되는 모든 파일을 저장하는 하나의 서버와 해당 서버에 파일들을 가져오는 다수
    의 클라이언트가 존재한다.
    만약, 서버가 잘못되면 모든것이 잘못된다. 모든 이력을 서버 한곡에서 관리하기 때문이다.
  
  - GIT은 분산버전 관리 시스템(Distributed Version Control System: DVCS)
    DVCS는 관리되는 모든 파일을 클라이언트와 서버에 분산해서 저장한다.(서버에 있는 파일을 
    클라이언트에 통째로 복사 Git clone을 통해서 repository를 통째로 가지고 온다.)
    만약 서버가 날라가도, 로컬에 파일또는 repository가 있기때문에 이걸 또 원격 저장소로 
    공유 및 복구도 가능하다.  
  
  3)Git/Github/Gitlab 차이
    Git은 VCS(Version Control System)말그대로 하나의 시스템 도구를 의미 하며
    Github/ Gitlab은 Git을 사용하는 프로젝트를 지원하는 웹 호스팅 기반 서비스다.
    즉 Git을 사용하는 프로젝트에 대해 웹에서 git repository를 제공해주는 역할을 한다. 
    
```
# 1. Ubuntu Git 설치 

## 1) Git 설치 및 설정
```bash
#apt-get 이용하여 설치 
$ sudo apt-get install git-core
Reading package lists... Done
Building dependency tree       
Reading state information... Done
Note, selecting 'git' instead of 'git-core'
Suggested packages:
  git-daemon-run | git-daemon-sysvinit git-doc git-el git-email git-gui gitk gitweb git-cvs git-mediawiki git-svn
The following packages will be upgraded:
  git
1 upgraded, 0 newly installed, 0 to remove and 163 not upgraded.
Need to get 3,907 kB of archives.
After this operation, 20.5 kB of additional disk space will be used.
Get:1 http://archive.ubuntu.com/ubuntu bionic-updates/main amd64 git amd64 1:2.17.1-1ubuntu0.4 [3,907 kB]
Fetched 3,907 kB in 21s (184 kB/s)  

#사용자 정보추가
$ git config --global user.name "이름"
$ git config --global user.email "이메일주소"

#기본설정 리스트
$ git config --list
user.name=sdh
user.email=sdh@naver.com

# 변환된 소스 쉽게 판별하기 위한 컬러 설정
$ git config --global color.ui "auto"

```


## 2) Git 프로젝트 생성
```bash
# 새로운 폴더 생성
$ mkdir FirstGit

# 생성된 폴더 안에서 새로운 git 저장소 생성
$ git init
Initialized empty Git repository in /home/sdh/FirstGit/.git/
$ ll
drwxrwxr-x 3 sdh sdh 4096 Feb 13 08:23 ./
drwxr-xr-x 5 sdh sdh 4096 Feb 13 08:23 ../
drwxrwxr-x 7 sdh sdh 4096 Feb 13 08:23 .git/

# 저장소에 추가할 파일 생성
$ vim README (내용 아무거나 추가~)

# git은 코드 생성시 add , commit 절차 필요.
                add                 commit
 working dir    -->    index(Stage)  -->    head

# 변경된 파일을 Stage 인덱스에 추가
$ git add README

# stage 의 상태 확인
$ git status 
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   README

# commit 명령어를 이용하여 head 에 저장
$ git commit -m "이번 커밋 내용"
[master (root-commit) 07a9daf] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README

# 변경된 이력 확인
$ git log
Author: sdh <sdh@naver.com>
Date:   Wed Feb 13 08:43:55 2019 +0000

    first commit

# git 원격 저장소 서버 주소 연결  ex)http://github.com/sdh0213/FirstGit
$ git remote add origin 원격서버주소

# 원격저장소에 파일 push
$ git push origin master
Username for 'https://github.com': sdh
Password for 'https://sdh0213@github.com': 
Counting objects: 3, done.
Writing objects: 100% (3/3), 198 bytes | 198.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/sdh0213/FirstGit.git
 * [new branch]      master -> master
 
 # git init 없이 원격 서버의 저장소를 복제 하는 방법
 $ git clone 원격서버주소
 

```




## 3) branch 생성 및 이동

```bash
# 저장소를 새로 만들면 기본으로 master 가지가 만들어짐 이제 다른 가지를 이용해서 개발을 진행하고 나중에 개발이 완료 되면 master 가지로 돌아와 병합

# sub 라는 branch 생성
$ git checkout -b sub
Switched to a new branch 'sub'

# 현재 branch 확인
$ git branch
  master
* sub

# README 파일 수정 및 master merge
$ vi README(내용 추가)

$ ll
total 1
-rw-r--r-- 1 sdh02 197609 6 3월  13 13:44 README

$ git add README

$ git commit -m 'commit'
[sub 41a0bd7] commit
 1 file changed, 2 insertions(+)
 create mode 100644 README

# branch 이동
$ git checkout master
Switched to branch 'master'

# README 파일 merge
$ ll
total 1
-rw-r--r-- 1 sdh02 197609 6 3월  13 13:44 README

$ cat README
aaaaa

$ git merge sub
Updating 9221249..41a0bd7
Fast-forward
 REAMDE | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 README

$ cat README
aaaaa
bbbbb


# branch 삭제
$ git branch -d sub
Deleted branch sub (was 07a9daf).


# sub branch에서 작성된 파일을 master 와 merge
$ git merge sub [msater 브렌치에서 실행]

# 변경내용 병합전 비교
$ git diff <원래가지> <비교대상가지>
```



## 3) 로컬 변경 내용 

```bash
# 실수로 파일을 지우거나 꼬인경우 로컬(head)의파일로 되돌리기
$ git checkout -- <파일이름>

# 충돌로 인한 로컬의 변경내용을 모두 포기하고 원격 저장소의 최신 이력을 가져오기(svn의 overried update)
$ git fetch origin
$ git reset --hard origin/master
```





> 
