public class FriendMain {
    
    public static void main(String args[]){

        FriendObject friend1 = new FriendObject("Harry");
        FriendObject friend2 = new FriendObject("Draco");
        FriendObject friend3 = new FriendObject("Ronald");
        FriendObject friend4 = new FriendObject("Hermione");


        System.out.println("Object name wise: ");

        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);
        System.out.println(friend4.numOfFriends);

        // better to access static var with class name
        System.out.println("Class name wise: ");
        System.out.println(FriendObject.numOfFriends);

        FriendObject.showFriends();
    }
}
