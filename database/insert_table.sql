use newservlet12month2018;

insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('USER','người dùng');

insert into user(username,password,fullname,status, roleid) values('nguyenvana','123456','Nguyễn Văn A',1,2);
insert into user(username,password,fullname,status, roleid) values('nguyenvanb','123456','Nguyễn Văn B',1,2);
insert into user(username,password,fullname,status, roleid) values('nguyenvanc','123456','Nguyễn Văn C',1,2);
insert into user(username,password,fullname,status, roleid) values('nguyenvand','123456','Nguyễn Văn D',1,2);

