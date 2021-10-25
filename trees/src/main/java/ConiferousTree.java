public class ConiferousTree implements Tree {
    public String species;
    public Trunk trunk;
    public Branches branches;
    public String leafs;

    public ConiferousTree(String species, Trunk trunk, Branches branches, String leafs) {
        this.species = species;
        this.trunk = trunk;
        this.branches = branches;
        this.leafs = leafs;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public void setBranches(Branches branches) {
        this.branches = branches;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public Trunk getTrunk() {
        return trunk;
    }

    @Override
    public Branches getBranches() {
        return branches;
    }

    @Override
    public String getLeafs() {
        return leafs;
    }

    @Override
    public String leafsDropping() {
        return "My needles are falling :( ";
    }
}
