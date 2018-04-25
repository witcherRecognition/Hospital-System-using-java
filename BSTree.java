
public class BSTree
{
    private TreeNode root;
    
    public BSTree(){root = null;}
    
    public void insertNode(PatientInfo d){
        if(root==null)
            root = new TreeNode(d);
        else
            root.insert(d);
    }
    
     public void SortingPatient(){
        SortingHelp(root);
    }   
    
    public void SortingHelp(TreeNode n){
        if(n==null)
            return;
        else{
            SortingHelp(n.left);
            System.out.println("PI"+n.data.getReg_no());
            SortingHelp(n.right);
        }
    }
    
        public double TotalIncome(){
        return TotalHelp(root,0);
    }
    
    public double TotalHelp(TreeNode n,double sum){
        if(n==null)
            return 0;
        else{
            sum = sum+TotalHelp(n.left,sum)+TotalHelp(n.right,sum)+n.data.getPay();
            return sum;
        }
    }
}
