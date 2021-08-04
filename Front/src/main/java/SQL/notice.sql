 create table jspweb.notice(

	nno int primary key auto_increment,
    ntitle varchar(100) not null,
    ncontents varchar(2000) not null,
    nwriter varchar(100) not null,
    ndate datetime default current_timestamp not null,
    ncount int not null,
    nfile varchar(1000)
	)   