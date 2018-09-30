public class Operations {

    Node root ;
    void insert(int value)
    {

        root = insertValue(root, value);


    }

    //A recursive function to insert key in Binary Search Tree
    private Node insertValue(Node root, int value) {



        // If a tree is null
        if (root==null)
        {

            root = new Node(value);
            return root;
        }

        // A recursive function to insert a key in BST

        if (value < root.value)
        {


            root.Left = insertValue(root.Left,value);



        }
        else if (value> root.value)
        {
            root.Right = insertValue(root.Right,value);
        }
        return root;
    }


    void inorder()  {

        System.out.println("****** InOrder ********");

        inorderRec(root);

    }

    private void inorderRec(Node root) {



        if (root != null) {

            inorderRec(root.Left);
             System.out.println(root.value);

            inorderRec(root.Right);


        }
    }


    void preorder()
    {

        System.out.println("****** PreOrder ********");

        preorderRec(root);
    }

    private void preorderRec(Node root)
    {

        if (root != null) {

            System.out.println(root.value);
            preorderRec(root.Left);

            preorderRec(root.Right);


        }
    }



    void postOrder()
    {
        System.out.println("****** PostOrder ********");

        postOrderRec(root);
    }

    private void postOrderRec(Node root) {

        if (root != null) {



            postOrderRec(root.Left);

            postOrderRec(root.Right);

                System.out.println(root.value);


                
        }

    }


}
