
public class TreeNode
{
   TreeNode left;
   PatientInfo data;
   TreeNode right;
   
    public TreeNode(PatientInfo d){
        data = d;
        left=right=null;
    }
    
    public void insert(PatientInfo d){
        if(d.getReg_no()<data.getReg_no()){
            if(left==null)
                left = new TreeNode(d);
            else
                left.insert(d);  
        }
        else if(d.getReg_no()>=data.getReg_no()){
            if(right==null)
                right = new TreeNode(d);
            else
                right.insert(d);
        }
    }
}
