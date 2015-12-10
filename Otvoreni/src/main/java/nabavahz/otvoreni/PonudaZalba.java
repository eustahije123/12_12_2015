package nabavahz.otvoreni;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("PonudaZalba")
public class PonudaZalba implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("IDPonudaZalba")
   private java.lang.Integer IDPonudaZalba;
   @org.kie.api.definition.type.Label("DatumPonudaZalba")
   private java.util.Date DatumPonudaZalba;
   @org.kie.api.definition.type.Label("DobavljacPonudaZalba")
   private java.lang.String DobavljacPonudaZalba;
   @org.kie.api.definition.type.Label("Ponuda")
   private java.lang.Boolean Ponuda;
   @org.kie.api.definition.type.Label("Zalba")
   private java.lang.Boolean Zalba;

   @org.kie.api.definition.type.Label("ObrazlozenjeZalba")
   private java.lang.String ObrazlozenjeZalba;

   @org.kie.api.definition.type.Label(value = "NakonRoka")
   private java.lang.Boolean nakonRoka;

   public PonudaZalba()
   {
   }

   public java.lang.Integer getIDPonudaZalba()
   {
      return this.IDPonudaZalba;
   }

   public void setIDPonudaZalba(java.lang.Integer IDPonudaZalba)
   {
      this.IDPonudaZalba = IDPonudaZalba;
   }

   public java.util.Date getDatumPonudaZalba()
   {
      return this.DatumPonudaZalba;
   }

   public void setDatumPonudaZalba(java.util.Date datumPonudaZalba)
   {
      this.DatumPonudaZalba = datumPonudaZalba;
   }

   public java.lang.String getDobavljacPonudaZalba()
   {
      return this.DobavljacPonudaZalba;
   }

   public void setDobavljacPonudaZalba(java.lang.String dobavljacPonudaZalba)
   {
      this.DobavljacPonudaZalba = dobavljacPonudaZalba;
   }

   public java.lang.Boolean getPonuda()
   {
      return this.Ponuda;
   }

   public void setPonuda(java.lang.Boolean ponuda)
   {
      this.Ponuda = ponuda;
   }

   public java.lang.Boolean getZalba()
   {
      return this.Zalba;
   }

   public void setZalba(java.lang.Boolean zalba)
   {
      this.Zalba = zalba;
   }

   public java.lang.String getObrazlozenjeZalba()
   {
      return this.ObrazlozenjeZalba;
   }

   public void setObrazlozenjeZalba(java.lang.String obrazlozenjeZalba)
   {
      this.ObrazlozenjeZalba = obrazlozenjeZalba;
   }

   public PonudaZalba(java.lang.Integer IDPonudaZalba,
         java.util.Date DatumPonudaZalba, java.lang.String DobavljacPonudaZalba,
         java.lang.Boolean Ponuda, java.lang.Boolean Zalba,
         java.lang.String obrazlozenjeZalba)
   {
      this.IDPonudaZalba = IDPonudaZalba;
      this.DatumPonudaZalba = DatumPonudaZalba;
      this.DobavljacPonudaZalba = DobavljacPonudaZalba;
      this.Ponuda = Ponuda;
      this.Zalba = Zalba;
      this.ObrazlozenjeZalba = obrazlozenjeZalba;
      this.nakonRoka = nakonRoka;
   }

   public java.lang.Boolean getNakonRoka()
   {
      return this.nakonRoka;
   }

   public void setNakonRoka(java.lang.Boolean nakonRoka)
   {
      this.nakonRoka = nakonRoka;
   }

}