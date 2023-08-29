public class Listem <T>{

    private Object [] dizi;
    private int capacity;
    private int index;

    private int counter;


    Listem ()
    {
        this.capacity=10;
        this.dizi= new Object[capacity];
        this.index =0;
        this.counter=0;
    }

    Listem(int capacity)
    {

        this.capacity=capacity;
        this.dizi= new Object[capacity];
        this.index =0;
        this.counter=0;


    }

    public void add(T j)
    {
        if(this.counter>=10)
        {
            Listem l2 =  new Listem(this.capacity*2);
            for(int i=0;i<this.dizi.length;i++)
            {
                l2.dizi[i]=this.dizi[i];
            }
            this.dizi = l2.dizi;
            this.dizi[this.index++]=j;
            this.counter=0;
            this.capacity=l2.capacity;



        }
        else{
            this.dizi[this.index++]= j;
            this.counter++;
        }


    }





    public void printDizi()
    {
        for(int i=0; i<this.dizi.length;i++)
        {
            if(this.dizi[i]==null)
                break;
            else
                System.out.println(this.dizi[i]);
        }
    }

    public void getCapacity()
    {
        System.out.println("Dizinin Kapasitesi : " + this.capacity);

    }

    public void size()
    {
        System.out.println("Dizideki eleman sayısı : " + this.index);
    }


}
