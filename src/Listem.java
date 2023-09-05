

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

   public int indexOf(T data) {
       int i;
       for (i = 0; i < this.dizi.length; i++) {
           if (this.dizi[i] == data)
           {
               return i;
           }



       }
       return -1;

   }

   public int lastIndexOf(T data)
    {
        int i;
        for (i = this.dizi.length-1; i >= 0; i--) {
            if (this.dizi[i] == data)
            {
                return i;
            }



        }
        return -1;
    }

    public boolean isEmpty() {


        for (int i = 0; i < this.dizi.length; i++)
        {

            if (this.dizi[i] != null)
            {
                return false;

            }


        }

        return true;

    }

    Object [] toArray(){

        Object [] arr = new Object[this.dizi.length];
        for(int i=0;i<this.dizi.length;i++)
        {
            arr[i]= this.dizi[i];
        }

        return arr;
    }

    Listem<T> sublist(int start,int finish)
    {
        int x=(finish-start+1);
        Listem<T> t = new Listem(x);


        for(int i=0;i<x;i++)
        {
            t.dizi[i] =  this.dizi[start++];
            t.index++;
            t.counter++;
        }
        return t;

    }

   public void get(int index) {

       System.out.println(this.dizi[index]);

   }

    public void remove(int index)
    {
        Object [] temp = new Object[this.capacity-1];
        int count=0;
        for(int i=0;i<this.dizi.length-1;i++)
        {
            if(i==index)
            {
               i++;
            }


            temp[count++]=this.dizi[i];

        }

        this.dizi = temp;
        this.index = this.index-1;
        this.counter=this.counter-1;




    }

    public void set (int index, T data)
    {
        this.dizi[index]= data;
    }

    public String toString()
    {
        String temp;
        temp="[ ";
        for(int i=0; i<this.index;i++)
        {
           temp+=this.dizi[i];
           if(i!=this.index-1)
           {
               temp+=", ";
           }



        }
        temp+=" ]";

        return temp;

    }

    boolean contains(T data) {

        for (int i = 0; i < this.index; i++) {

            if (this.dizi[i] == data)
            {
                return true;
            }



        }


        return false;
    }

    void clear()
    {
        for(int i=0;i<this.index;i++)
        {
            this.dizi[i]=null;

        }

    }

}
