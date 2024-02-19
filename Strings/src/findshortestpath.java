package Strings.src;

public class findshortestpath {
    public static float Getshortestpath( String path)
    {
        // given a rute containing 4 directions ( E, W, N ,S) , find the shortest path to reach destination

        int x=0,y=0;
        // south = S = y-1;
        // north = N = Y+1;
        // west = W = X-1;
        // east = E = X+1;
        for (int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            // south
            if(dir=='S')
            {
                y--;
            }
            // north
            else if (dir=='N')
            {
                y++;
            }
            else if ( dir=='W')
            {
                x--;
            }
            else {
                x++;
            }
        }

     int X2= x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);



    }
    public static void main(String[] args) {
        String path= "WNEENESENNN";
        System.out.println(Getshortestpath(path));

    }
}
