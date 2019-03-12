package AlgorithmTest.DFSLearning;

public class validPartenthes {
    public void validPartenthes(int n, int l, int r, String solu_prefix){

        if (l + r == 2 * n){
            System.out.println( solu_prefix );
        }

        //case1: add '(' into solution
        // if the number of '(' in solu is < n
        if (l < n){
            solu_prefix = solu_prefix + "(";
            validPartenthes(n, l + 1, r, solu_prefix);
            solu_prefix = solu_prefix - "(";
        }

        //case2: add ')' into solution
        // if the number of ')' in solu is < the number of '(' in solu
        if (r < l){
            solu_prefix = solu_prefix + ")";
            validPartenthes(n, l, r + 1, solu_prefix);
            solu_prefix = solu_prefix - ")";
        }
    }

    public static void main(String[] args){
        String solution = "";
        int n = 3;
        int l = 0;
        int r = 0;
        validPartenthes(n, l, r, solution);
    }
}
