
public class main{
    public static void main (String args[]){
        String albert = "Albert Einstein and Nathan Rosen extended general relativity to expand the above idea.";
        String rosen = "They proposed the existence of tunnels or bridges through the space-time fabric.";
        int albertLength =albert.length()/2;
        int rosenLength= rosen.length()/2;
        String albert1 = albert.substring(0, albertLength);
        String rosen1 = rosen.substring(rosenLength,rosen.length());
        System.out.println(albert1+rosen1);

    }
}
