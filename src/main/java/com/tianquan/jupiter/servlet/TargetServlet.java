package com.tianquan.jupiter.servlet;

import org.json.JSONObject;
//import sun.misc.IOUtils;
import org.apache.commons.io.IOUtils;
import com.tianquan.jupiter.entity.Game;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tianquan.jupiter.external.*;


import javax.servlet.ServletException;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "TargetServlet", urlPatterns = {"/game"})
public class TargetServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
//        String name = jsonRequest.getString("name");
//        String developer = jsonRequest.getString("developer");
//        String releaseTime = jsonRequest.getString("release_time");
//        String website = jsonRequest.getString("website");
//        float price = jsonRequest.getFloat("price");
//
//        System.out.println("Name is: " + name);
//        System.out.println("Developer is: " + developer);
//        System.out.println("Release time is: " + releaseTime);
//        System.out.println("Website is: " + website);
//        System.out.println("Price is: " + price);
//
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        Method1:
//        String gameHeader = request.getHeader("gamename");
//        JSONObject object = new JSONObject();
//        object.put("name", "World of Warcraft");
//        object.put("developer", "Blizzard Entertainment");
//        object.put("price", 50.0);
//        String gameName = request.getParameter("gamename");
//        response.getWriter().print("Game is: " + gameName);
//        response.getWriter().print(object);

//        Method2:(preferred)
//        response.setContentType("application/json");
//        ObjectMapper mapper = new ObjectMapper();
//        Game game = new Game("World of Warcraft", "Blizzard Entertainment", "Feb 11, 2005", "https://www.worldofwarcraft.com", 49.99);
//        response.getWriter().print(mapper.writeValueAsString(game));

        System.out.print("calling builder");

        String gameName = request.getParameter("game_name");
        TwitchClient client = new TwitchClient();

        response.setContentType("application/json;charset=UTF-8");
        try {
            if (gameName != null) {
                response.getWriter().print(new ObjectMapper().writeValueAsString(client.searchGame(gameName)));
            } else {
                response.getWriter().print(new ObjectMapper().writeValueAsString(client.topGames(0)));
            }
        } catch (TwitchException e) {
            throw new ServletException(e);
        }
    }
}
