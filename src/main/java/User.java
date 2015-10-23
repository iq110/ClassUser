/**
 * Created by Серега on 23.10.2015.
 */
public class User {
    int id;
    String name;
    UserType type;

    User( int id, String name, UserType type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    User( int id, String name, String type ){
        this.id = id;
        this.name = name;
        this.type = UserType.valueOf(type);
    }




    protected enum UserType{
        ADMIN("Admin"),
        BUYER("Buyer"),
        SELLER("Seller");

        private String shortName;

        private UserType(String shortName){
            this.shortName = shortName;
        }

        public String getType(){
            return shortName;
        }
    }
}
