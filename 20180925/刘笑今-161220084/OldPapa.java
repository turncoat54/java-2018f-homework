public class OldPapa extends Creature {
    private static int globalnums = 0;
    OldPapa(){
        if(globalnums != 0){
            System.out.println("OldPapa has been created...!");
            reportCreateFailed();
        }
        else{
            globalnums++;
            x = y = -1;
            name = "OldPapa";
            identifier = '#';
            faction=true;
        }
    }
}
