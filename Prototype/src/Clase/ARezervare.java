package Clase;

public abstract class ARezervare {

   protected String numeClient;
   protected int nrPersoane;
   protected String data;
   protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {

      if(numeClient.length()>3){
          this.numeClient = numeClient;
      }else{
          this.numeClient="Anonim";
      }
        if(nrPersoane>=1){
            this.nrPersoane = nrPersoane;
        }else{
            this.nrPersoane=0;
        }
      if(data.length()==10){
          this.data = data;
      }else{
          this.data="02.02.2222";
      }
      if(ora.length()==5){
          this.ora = ora;
      }else{
          this.ora="00:00";
      }
    }

    public ARezervare() {
        this.numeClient = "Anonim";
        this.nrPersoane=1;
        this.data = "02.02.2022";
        this.ora="20:00";
    }

    public void setOra(String ora){
        this.ora = ora;
    }

    public abstract void descriere();
    public abstract ARezervare copiaza();

}
