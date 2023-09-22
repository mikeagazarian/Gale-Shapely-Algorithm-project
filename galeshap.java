import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner; 


public class galeshap{

// public static void match(List<List<Integer>> man, List<List<Integer>> women, List<Integer> couple, int pairs){
//     int m = 0;
//     int w = 0; 
//     List<Integer> freeMan = new ArrayList<Integer>();
    
//     for(int i = 0; i < pairs; i++){
//         freeMan.add(i);
//     }

//     while(couple.get(m).get(
//     }
// }

public static List<Integer> createManList(Scanner scan, int pairs){

    List<Integer> man = new ArrayList<Integer>();
    for(int i = 0; i < pairs; i++){
        man.add(scan.nextInt());
    }

    
    return man; 
}

public static List<Integer> createWomanList(Scanner scan, int pairs){
    
    List<Integer> woman = new ArrayList<Integer>();
    for(int i = 0; i < pairs; i++){
        woman.add(scan.nextInt());
    }
    

    return woman; 
}


public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int pairs = scan.nextInt();
    
    List<List<Integer>> men = new ArrayList<List<Integer>>(pairs); 
    List<List<Integer>> women = new ArrayList<List<Integer>>(pairs);
    List<List<Integer>> couple = new ArrayList<List<Integer>>(pairs);

    //creating list for men
    for(int i = 0; i < pairs; i++){
        men.add(createManList(scan, pairs));
    }
    // creating list for women
    for(int i = 0; i < pairs; i++){
        women.add(createWomanList(scan, pairs));
    }
    
    for(int i = 0; i < pairs; i++){
        couple.add(i, null);
    }


    //testing the list out
    System.out.println(men.get(0).get(1));
}
}