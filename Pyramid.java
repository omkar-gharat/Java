public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("HALF PYRAMID");
        // for regular half pyramid
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }

         // for inverted half pyramid
        System.out.println("INVERTED HALF PYRAMID");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }

        // for inverted half Pyramid (roated by 180 deg)
        System.out.println("INVERTED HALF PYRAMID(roated by 180 deg)");
        for(int i=1; i<=n; i++){
            
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                        System.out.print("*");
                }
            
            System.out.println();
        }

        // For Half Pyramid with Numbers
        System.out.println("HALF PYRAMID With Numbers");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // For Inverted Half Pyramid with Numbers
        System.out.println("INVERTED HALF PYRAMID With Numbers");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }   
            System.out.println();
        }

         // For Half Pyramid with Numbers
         System.out.println("HALF PYRAMID With Numbers");
         int number = 1;
         for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(number+" ");
                 number++;
             }
             System.out.println();
         }

         // For 0-1 triangle
        System.out.println("INVERTED HALF PYRAMID With Numbers");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum =i+j;
                if(sum%2==0){
                    System.out.print(1+"");
                }else{
                    System.out.print(0+"");
                }
            }   
            System.out.println();
        }

    }
}
