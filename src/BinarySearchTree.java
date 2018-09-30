public class BinarySearchTree {

public static void main (String[] args)
{
    Operations operations = new Operations();

    /*
    operations.insert(10);
    operations.insert(11);
    operations.insert(9);

    operations.insert(12);
    operations.insert(5);
    operations.insert(4);
    operations.insert(6);
    */

    operations.insert(18);
    operations.insert(16);
    operations.insert(25);

    operations.insert(14);
    operations.insert(17);
    operations.insert(24);

    operations.insert(27);
    operations.insert(19);
    operations.insert(20);





    /*
    operations.insert(10);
    operations.insert(9);
    operations.insert(11);

    operations.insert(5);
    operations.insert(12);

    operations.insert(4);
    operations.insert(6);

*/






     operations.inorder();

     operations.preorder();

     operations.postOrder();





}
}
