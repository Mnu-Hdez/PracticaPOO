package model;

public class User {
        protected String password;
        protected String mail;


        public User(String mail,String password)
        {
            this.password = password;
            this.mail = mail;
        }
    
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }
        
    }
    

