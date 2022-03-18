import java.util.*;
public class Physics
{
    public boolean equilibrium(){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[][] arr = new int[n][3];
        int x,y,z;
        x=0;
        y=0;
        z=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++)
                arr[i][j] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            x = x + arr[i][0];
            y = y + arr[i][1];
            z = z + arr[i][2];
        }
        if(x==0 && y==0 && z==0) {
            System.out.println("YES");
            return true;
        }
        else{
            System.out.println("NO");
            return false;
        }
    }
}
