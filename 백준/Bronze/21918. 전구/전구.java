import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int array[] = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int arrayChange[] = new int[3];
        for(int j=1; j<=m; j++){
            int index=0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                arrayChange[index++] = Integer.parseInt(st.nextToken());
            }

            if(arrayChange[0] ==1){
                array[arrayChange[1]] = arrayChange[2];
            }else if(arrayChange[0] ==2){
                for(int k=arrayChange[1]; k<=arrayChange[2];k++){
                    if(array[k]==0) array[k]=1;
                    else if(array[k]==1) array[k]=0;
                }
            }else if(arrayChange[0]==3){
                for(int o=arrayChange[1]; o<=arrayChange[2];o++){
                    array[o] =0;
                }
            }else if(arrayChange[0]==4){
                for(int y=arrayChange[1]; y<=arrayChange[2];y++){
                    array[y] =1;
                }
            }

        }

        for(int t=1;t<=n;t++){
            System.out.printf("%d ",array[t]);
        }

    }
}
