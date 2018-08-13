package com.package1;

import java.sql.*;

public class DababaseExa {
    public static void main(String[] args) {

            Connection connection = null;

            try{
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","9966176809");

//                 Statement statement = connection.createStatement();
//
//   PreparedStatement preparedStatement = connection.prepareStatement("insert into student(id,name) values (?,?)");
//
//         preparedStatement.setInt(1,3);
//         preparedStatement.setString(2,"sukanya");
// preparedStatement.executeUpdate();
//                 ResultSet resultSet= statement.executeQuery("select * from student");
                 DababaseExa exa=new DababaseExa();
                 exa.getData(connection);
                 exa.setData(connection);

//       while (resultSet.next()){
//             System.out.println("id: " +resultSet.getString("id"));
//            System.out.println("name: " +resultSet.getString("name"));
//         }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(connection != null){
                    try{
                        connection.close();
                    }catch (Exception se){
                        se.printStackTrace();
                    }
                }
            }



        }

        public void setData(Connection connection){

            try {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into student(id,name) values (?,?)");
                preparedStatement.setInt(1,1212);
                preparedStatement.setString(2,"sukanya");
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public void getData(Connection connection){
            try{
                Statement statement = connection.createStatement();

                ResultSet resultSet= statement.executeQuery("select * from student");

                while (resultSet.next()){
                    System.out.println("id: " +resultSet.getString("id"));
                    System.out.println("name: " +resultSet.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            }
    public void delete(Connection Connection){
        try {
            Statement statement = Connection.createStatement();
            boolean b = statement.execute("delete * from student");
            System.out.println("delete id from the row 2" );

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    }



