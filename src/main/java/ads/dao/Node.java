package ads.dao;

import ads.model.Product;

/**
 * Node
 */
public class Node {

    private int index;
    private Product product;
    private Node left;
    private Node right;

    public Node(int index, Product product) {
        this.index = index;
        this.product = product;
    }

    /**
     * @return int return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return Node return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @return Node return the right
     */
    public Node getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return Product return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    public void add(int index, Product product) {
        if (index < this.index) {
            if (left != null) {
                left.add(index,product);
            } else {
                left = new Node(index,product);
            }
        } else {
            if (right != null) {
                right.add(index,product);
            } else {
                right = new Node(index,product);
            }
        }
    }

    public Product find(int index) {
        if (index == this.index) {
            return this.product;
        } else if (index < this.index) {
            if (this.left != null) {
                return this.left.find(index);
            } else {
                return null;
            }
        } else {
            if (this.right != null) {
                return this.right.find(index);
            } else {
                return null;
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(index + " - " + product.getId());
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(index);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(index);
    }

    @Override
    public String toString() {
        return "{" + " index='" + getIndex() + "'" + ", left='" + getLeft() + "'" + ", right='" + getRight() + "'"
                + "}";
    }

}