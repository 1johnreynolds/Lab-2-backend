mysqldump:

1. open terminal: input mysqldump

2. if it shows: "mysqldump: command not found":
    2.1 then input command: $vi ~/.bash_profile
    2.2 add three line code:
        //
        #mysql
        PATH=$PATH:/usr/local/mysql(or your own mysql file name, my file name is: mysql-8.0.17-macos10.14-x86_64)/bin
        export
        //
    2.3 save it. and input command: $source ~/.bash_profile
    else jump to step 3.

3. input command: $mysqldump -u root -p CS7340TEAMONELABONE pub_Info> './pub_Info.sql' (Export database CS7340TEAMONELABONE.pub_info table into current path)
4. input command: $mysql -h localhost -u root -p123321123(database password) -D CS7340TEAMONELABONE <./pub_Info.sql (Or import pub_Info.sql table into database CS7340TEAMONELABONE)
mysqldump -uroot -p CS7340TEAMONELABONE pub_Info> ./pub_Info.sql
mysql -h localhost -uroot -p -D CS7340TEAMONELABTWO <./pub_Info.sql
mysqldump -uroot -p CS7340TEAMONELABONE auth_info> ./auth_info.sql
mysql -h localhost -uroot -p -D CS7340TEAMONELABTWO < auth_info.sql