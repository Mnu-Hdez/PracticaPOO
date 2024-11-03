package model;

public class User {
        protected String name;
        protected String password;
        protected String mail;
    
    
        public User(String name,String dni,String mail)
        {
            this.name = name;
            this.password = dni;
            this.mail = mail;
        }
    
        public String getPassword() {
            return password;
        }

        public void setPassword(String dni) {
            this.password = dni;
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
    

