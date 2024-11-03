package model;

public class User {
        protected String name;
        protected String password;
        protected String mail;


        public User(String name,String password,String mail)
        {
            this.name = name;
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

        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
        
        @Override
        public String toString()
        {
            return name +", ";
        }
        
    }
    

