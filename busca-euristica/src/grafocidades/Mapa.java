/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafocidades;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elton Alves
 */
public class Mapa implements Serializable {
    private Cidade arad;             //#1
    private Cidade buscharest;       //#2
    private Cidade craiova;          //#3
    private Cidade dobreta;          //#4
    private Cidade eforie;           //#5
    private Cidade fagaras;          //#6
    private Cidade giurgiu;          //#7
    private Cidade hirsova;          //#8
    private Cidade iasi;             //#9
    private Cidade lugoj;            //#10
    private Cidade mehadia;          //#11
    private Cidade neamt;            //#12
    private Cidade oradea;           //#13
    private Cidade pitesti;          //#14
    private Cidade rimnicuVilcea;    //#15  
    private Cidade sibiu;            //#16
    private Cidade timisoara;        //#17
    private Cidade urziceni;         //#18
    private Cidade vaslui;           //#19
    private Cidade zerid;            //#20
    

	private List<Cidade> listCidades;

	public Mapa() {
		listCidades = new ArrayList<>();
		arad = new Cidade("Arad", 366);
                buscharest = new Cidade("Buscharest", 0);
                craiova = new Cidade("Craiova", 160);
                dobreta = new Cidade("Dobreta", 242);
                eforie = new Cidade("Eforie", 161);
                fagaras = new Cidade("Fagaras", 178);
                giurgiu = new Cidade("Giurgiu", 77);
                hirsova = new Cidade("Hirsova", 151);
                iasi = new Cidade("Iasi", 226);
                lugoj = new Cidade("Lugoj", 244);
                mehadia = new Cidade("Mehadia", 241);
                neamt = new Cidade("Neamt", 234);
                oradea = new Cidade("Oradea", 380);
                pitesti = new Cidade("Pitesti", 98);
                rimnicuVilcea = new Cidade("Rimnicu Vilcea", 193);
                sibiu = new Cidade("Sibiu", 253);
                timisoara = new Cidade("Timisoara", 329);
                urziceni = new Cidade("Urziceni", 80);
                vaslui = new Cidade("Vaslui", 199);
                zerid = new Cidade("Zerid", 374);
		
                
		 //Adicionando as cidades adjacentes
        arad.addCidadeAdjacente(new Adjacente(zerid, 75));
        arad.addCidadeAdjacente(new Adjacente(timisoara, 118));
        arad.addCidadeAdjacente(new Adjacente(sibiu, 140));
        
        buscharest.addCidadeAdjacente(new Adjacente(fagaras, 211));
        buscharest.addCidadeAdjacente(new Adjacente(pitesti, 101));
        buscharest.addCidadeAdjacente(new Adjacente(giurgiu, 90));
        buscharest.addCidadeAdjacente(new Adjacente(urziceni, 85));
    
        craiova.addCidadeAdjacente(new Adjacente(dobreta, 120));
        craiova.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 146));
        craiova.addCidadeAdjacente(new Adjacente(pitesti, 138));
        
        dobreta.addCidadeAdjacente(new Adjacente(mehadia, 75));
        dobreta.addCidadeAdjacente(new Adjacente(craiova, 120));
        
        eforie.addCidadeAdjacente(new Adjacente(hirsova, 86));
        
        fagaras.addCidadeAdjacente(new Adjacente(sibiu, 99));
        fagaras.addCidadeAdjacente(new Adjacente(buscharest, 211));
        
        giurgiu.addCidadeAdjacente(new Adjacente(buscharest, 90));
        
        hirsova.addCidadeAdjacente(new Adjacente(urziceni, 98));
        hirsova.addCidadeAdjacente(new Adjacente(eforie, 86));
        
        iasi.addCidadeAdjacente(new Adjacente(neamt, 87));
        iasi.addCidadeAdjacente(new Adjacente(vaslui, 92));
        
        lugoj.addCidadeAdjacente(new Adjacente(mehadia, 70));
        lugoj.addCidadeAdjacente(new Adjacente(timisoara, 111));
        
        mehadia.addCidadeAdjacente(new Adjacente(lugoj, 70));
        mehadia.addCidadeAdjacente(new Adjacente(dobreta, 75));
        
        neamt.addCidadeAdjacente(new Adjacente(iasi, 87));
        
        oradea.addCidadeAdjacente(new Adjacente(sibiu, 151));
        oradea.addCidadeAdjacente(new Adjacente(zerid, 71));
        
        pitesti.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 97));
        pitesti.addCidadeAdjacente(new Adjacente(craiova, 138));
        pitesti.addCidadeAdjacente(new Adjacente(buscharest, 101));
        
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(sibiu, 80));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti, 97));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova, 146));
        
        sibiu.addCidadeAdjacente(new Adjacente(arad, 140));
        sibiu.addCidadeAdjacente(new Adjacente(oradea, 151));
        sibiu.addCidadeAdjacente(new Adjacente(fagaras, 99));
        sibiu.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 80));
        
        timisoara.addCidadeAdjacente(new Adjacente(arad, 118));
        timisoara.addCidadeAdjacente(new Adjacente(lugoj, 111));
        
        urziceni.addCidadeAdjacente(new Adjacente(buscharest, 85));
        urziceni.addCidadeAdjacente(new Adjacente(vaslui, 142));
        urziceni.addCidadeAdjacente(new Adjacente(hirsova, 98));
        
        vaslui.addCidadeAdjacente(new Adjacente(iasi, 92));
        vaslui.addCidadeAdjacente(new Adjacente(urziceni, 142));
        
        zerid.addCidadeAdjacente(new Adjacente(arad, 75));
        zerid.addCidadeAdjacente(new Adjacente(oradea, 71));

        }
	public List<Cidade> getListCidades() {
		return listCidades;
	}

	public void setListCidades(List<Cidade> listCidades) {
		this.listCidades = listCidades;
	}

    /**
     * @return the arad
     */
    public Cidade getArad() {
        return arad;
    }

    /**
     * @param arad the arad to set
     */
    public void setArad(Cidade arad) {
        this.arad = arad;
    }

    /**
     * @return the buscharest
     */
    public Cidade getBuscharest() {
        return buscharest;
    }

    /**
     * @param buscharest the buscharest to set
     */
    public void setBuscharest(Cidade buscharest) {
        this.buscharest = buscharest;
    }

    /**
     * @return the craiova
     */
    public Cidade getCraiova() {
        return craiova;
    }

    /**
     * @param craiova the craiova to set
     */
    public void setCraiova(Cidade craiova) {
        this.craiova = craiova;
    }

    /**
     * @return the dobreta
     */
    public Cidade getDobreta() {
        return dobreta;
    }

    /**
     * @param dobreta the dobreta to set
     */
    public void setDobreta(Cidade dobreta) {
        this.dobreta = dobreta;
    }

    /**
     * @return the eforie
     */
    public Cidade getEforie() {
        return eforie;
    }

    /**
     * @param eforie the eforie to set
     */
    public void setEforie(Cidade eforie) {
        this.eforie = eforie;
    }

    /**
     * @return the fagaras
     */
    public Cidade getFagaras() {
        return fagaras;
    }

    /**
     * @param fagaras the fagaras to set
     */
    public void setFagaras(Cidade fagaras) {
        this.fagaras = fagaras;
    }

    /**
     * @return the giurgiu
     */
    public Cidade getGiurgiu() {
        return giurgiu;
    }

    /**
     * @param giurgiu the giurgiu to set
     */
    public void setGiurgiu(Cidade giurgiu) {
        this.giurgiu = giurgiu;
    }

    /**
     * @return the hirsova
     */
    public Cidade getHirsova() {
        return hirsova;
    }

    /**
     * @param hirsova the hirsova to set
     */
    public void setHirsova(Cidade hirsova) {
        this.hirsova = hirsova;
    }

    /**
     * @return the iasi
     */
    public Cidade getIasi() {
        return iasi;
    }

    /**
     * @param iasi the iasi to set
     */
    public void setIasi(Cidade iasi) {
        this.iasi = iasi;
    }

    /**
     * @return the lugoj
     */
    public Cidade getLugoj() {
        return lugoj;
    }

    /**
     * @param lugoj the lugoj to set
     */
    public void setLugoj(Cidade lugoj) {
        this.lugoj = lugoj;
    }

    /**
     * @return the mehadia
     */
    public Cidade getMehadia() {
        return mehadia;
    }

    /**
     * @param mehadia the mehadia to set
     */
    public void setMehadia(Cidade mehadia) {
        this.mehadia = mehadia;
    }

    /**
     * @return the neamt
     */
    public Cidade getNeamt() {
        return neamt;
    }

    /**
     * @param neamt the neamt to set
     */
    public void setNeamt(Cidade neamt) {
        this.neamt = neamt;
    }

    /**
     * @return the oradea
     */
    public Cidade getOradea() {
        return oradea;
    }

    /**
     * @param oradea the oradea to set
     */
    public void setOradea(Cidade oradea) {
        this.oradea = oradea;
    }

    /**
     * @return the pitesti
     */
    public Cidade getPitesti() {
        return pitesti;
    }

    /**
     * @param pitesti the pitesti to set
     */
    public void setPitesti(Cidade pitesti) {
        this.pitesti = pitesti;
    }

    /**
     * @return the rimnicuVilcea
     */
    public Cidade getRimnicuVilcea() {
        return rimnicuVilcea;
    }

    /**
     * @param rimnicuVilcea the rimnicuVilcea to set
     */
    public void setRimnicuVilcea(Cidade rimnicuVilcea) {
        this.rimnicuVilcea = rimnicuVilcea;
    }

    /**
     * @return the sibiu
     */
    public Cidade getSibiu() {
        return sibiu;
    }

    /**
     * @param sibiu the sibiu to set
     */
    public void setSibiu(Cidade sibiu) {
        this.sibiu = sibiu;
    }

    /**
     * @return the timisoara
     */
    public Cidade getTimisoara() {
        return timisoara;
    }

    /**
     * @param timisoara the timisoara to set
     */
    public void setTimisoara(Cidade timisoara) {
        this.timisoara = timisoara;
    }

    /**
     * @return the urziceni
     */
    public Cidade getUrziceni() {
        return urziceni;
    }

    /**
     * @param urziceni the urziceni to set
     */
    public void setUrziceni(Cidade urziceni) {
        this.urziceni = urziceni;
    }

    /**
     * @return the vaslui
     */
    public Cidade getVaslui() {
        return vaslui;
    }

    /**
     * @param vaslui the vaslui to set
     */
    public void setVaslui(Cidade vaslui) {
        this.vaslui = vaslui;
    }

    /**
     * @return the zerid
     */
    public Cidade getZerid() {
        return zerid;
    }

    /**
     * @param zerid the zerid to set
     */
    public void setZerid(Cidade zerid) {
        this.zerid = zerid;
    }

}

