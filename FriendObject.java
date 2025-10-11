public class FriendObject {
    
    static int numOfFriends;
    String name;

    FriendObject(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have total of "+ numOfFriends+" friends."); // no need of this keyword
    }
}
