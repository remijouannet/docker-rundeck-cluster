loglevel.default = "INFO"
rdeck.base = "/var/lib/rundeck"
rss.enabled = "false"
grails.serverURL = "https://localhost:4443"

dataSource.dbCreate = "update"
dataSource.url = "jdbc:mysql://mysql/rundeckdb?autoReconnect=true"
dataSource.username = "rundeckuser"
dataSource.password = "rundeckpassword"
dataSource.driverClassName = "com.mysql.jdbc.Driver"

rundeck.clusterMode.enabled=true

//rundeck.projectsStorageType= "db"

//dataSource.url = "jdbc:h2:file:/var/lib/rundeck/data/rundeckdb;MVCC=true;TRACE_LEVEL_FILE=4"

//please see the following link for more information
//http://www.grails.org/plugin/mail#Configuration
grails {
   mail {
     host = "smtp.com"
     port = 587
     username = "noreply@test.com"
     password = "password"
     props = ["mail.smtp.starttls.enable":"true", 
                  "mail.smtp.port":"587"]
   }
}
grails.mail.default.from="noreply@test.com"

