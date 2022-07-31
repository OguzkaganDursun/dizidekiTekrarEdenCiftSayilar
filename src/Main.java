import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {1,3,5,2,6,8,9,2,6,8,12,15,12};
        int[] ayniSayilar = new int[dizi.length];
        int sayac = 0;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = 0; j < dizi.length; j++)
            {
                if (i != j && dizi[i] == dizi[j])
                {
                    if (dizi[i] % 2 == 0)
                    {
                        ayniSayilar[sayac++] = dizi[i];
                        break;
                    }
                }
            }
        }
        Arrays.sort(ayniSayilar);
        System.out.println(Arrays.toString(ayniSayilar));
        System.out.println("***************************");
        for (int deger : ayniSayilar)
        {
            if (deger != 0)
            {
                System.out.print(deger + " , ");
            }
        }

    }
}
