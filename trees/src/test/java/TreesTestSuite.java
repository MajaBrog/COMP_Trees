import org.junit.Assert;
import org.junit.Test;

public class TreesTestSuite {
    @Test
    public void testFactoryConiferousTree() {
        //Given
        TreeFactory treeFactory = new TreeFactory();
        //When
        Tree coniferousTree = treeFactory.createTree(TreeFactory.CONIFEROUS_TREE, Trunk.SMOOTH, Branches.HORIZONTAL, "Green long needles");
        //Then
        Assert.assertEquals("CONIFEROUS TREE", coniferousTree.getSpecies());
        Assert.assertEquals(Trunk.SMOOTH, coniferousTree.getTrunk());
        Assert.assertEquals(Branches.HORIZONTAL, coniferousTree.getBranches());
        Assert.assertEquals("Green long needles", coniferousTree.getLeafs());
    }

    @Test
    public void testFactoryLeafyTree() {
        //Given
        TreeFactory treeFactory = new TreeFactory();
        //When
        Tree leafyTree = treeFactory.createTree(TreeFactory.LEAFY_TREE, Trunk.PLATES, Branches.VERTICAL, "Green round leafs");
        //Then
        Assert.assertEquals("LEAFY TREE", leafyTree.getSpecies());
        Assert.assertEquals(Trunk.PLATES, leafyTree.getTrunk());
        Assert.assertEquals(Branches.VERTICAL, leafyTree.getBranches());
        Assert.assertEquals("Green round leafs", leafyTree.getLeafs());
    }

    @Test
    public void testTreeGrow() {
        //Given
        TreeFactory treeFactory = new TreeFactory();
        //When
        Tree coniferousTree = treeFactory.createTree(TreeFactory.CONIFEROUS_TREE, Trunk.SMOOTH, Branches.HORIZONTAL, "Green round leafs");
        Tree leafyTree = treeFactory.createTree(TreeFactory.LEAFY_TREE, Trunk.PLATES, Branches.VERTICAL, "Green round leafs");

        //Then
        Assert.assertEquals("I'm growing!", coniferousTree.grow());
        Assert.assertEquals("I'm growing!", leafyTree.grow());
    }

    @Test
    public void testTreeLeafsDropping() {
        //Given
        TreeFactory treeFactory = new TreeFactory();
        //When
        Tree coniferousTree = treeFactory.createTree(TreeFactory.CONIFEROUS_TREE, Trunk.SMOOTH, Branches.HORIZONTAL, "Green round leafs");
        Tree leafyTree = treeFactory.createTree(TreeFactory.LEAFY_TREE, Trunk.PLATES, Branches.VERTICAL, "Green round leafs");

        //Then
        Assert.assertEquals("My needles are falling :( ", coniferousTree.leafsDropping());
        Assert.assertEquals("My leafs are falling :(", leafyTree.leafsDropping());
    }
}
