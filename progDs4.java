public class progDs4 
{
    static Integer N = 8;
    static Integer[] queens = new Integer[N];

    static boolean isSafe(Integer r, Integer c) 
    {
        for (Integer i = 0; i < r; i++) {
            if (queens[i] == c || Math.abs(queens[i] - c) == Math.abs(i - r)) 
            {
                return false;
            }
        }
        return true;
    }

    static boolean solution(Integer r) 
    {
        if (r == N) 
        {
            return true;
        }
        for (Integer c = 0; c < N; c++) 
        {
            if (isSafe(r, c)) 
            {
                queens[r] = c;
                if (solution(r + 1)) 
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        if (solution(0)) 
        {
            for (Integer i = 0; i < N; i++) 
            {
                for (Integer j = 0; j < N; j++) 
                {
                    if (queens[i] == j) {
                        System.out.print(" Q ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        } 
    }
}
