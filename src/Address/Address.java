package Address;

import model.AddressBooks;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Address {
    public Address(){

    }



    public static void addNewBooks(AddressBooks add) throws Exception {
        try{
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ADDRESS_BOKK(ID,NAME,COMPANY,GMAIL,PHONE) VALUES (?,?,?,?,?)");
            pstmt.setInt(1,add.getId());
            pstmt.setString(2, add.getName());
            pstmt.setString(3, add.getCompany());
            pstmt.setString(4, add.getEmail());
            pstmt.setInt(5,add.getPhone());
            int updated = pstmt.executeUpdate();
            if(updated > 0){
                System.out.println("Insert Address Books Success!!!");
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

public AddressBooks getBooksById(int id)throws Exception{
    AddressBooks add = null;
    try{
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT ID,NAME,COMPANY,GMAIL,PHONE FROM ASSRESS_BOKK WHERE ID = ?");
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            id = rs.getInt(1);
            String name = rs.getString(2);
            String company = rs.getString(3);
            String gmail = rs.getString(4);
            int phone = rs.getInt(5);
            add= new AddressBooks(id,name,company,gmail,phone);
        }
        return add;
    }catch (Exception e){
        throw new Exception(e.getMessage());
    }

}
}
