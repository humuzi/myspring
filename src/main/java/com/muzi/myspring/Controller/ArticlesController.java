package com.muzi.myspring.Controller;

import java.util.*;
import com.alibaba.fastjson.JSONObject;
import com.muzi.myspring.Response.Response;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Create by HuQiuYue on 2019-04-11
 */

@RestController
public class ArticlesController {

    @GetMapping("/articles/{id}")
    public Response getArticleById(@PathVariable("id") int id){
        JSONObject json = new JSONObject();
//        json.put("id",id);
        json.put("content", UUID.randomUUID());
        return new Response(200,"success",json) ;
    }

    @PutMapping("/articles/{id}")
    public Response updateById(@PathVariable("id") int id){
        JSONObject json = new JSONObject();
        json.put("content",UUID.randomUUID());
        return new Response(200,"Success",json);
    }

    @DeleteMapping("/articles/{id}")
    public Map<String, Boolean> deleteArticle(@PathVariable("id") String id){
        JSONObject json = new JSONObject();
        json.remove(id);
        Map<String,Boolean>  result = new HashMap<>();
        result.put("delete",Boolean.TRUE);
        return result;
    }


    @GetMapping("/selectArticles")
    public Response oldGetById(@RequestParam("id") int id){
        JSONObject json = new JSONObject();
        json.put("id",id);
        json.put("content",UUID.randomUUID());
        return new Response(200,"success",json);
    }

    @PostMapping("/updateArticles")
    public JSONObject oldUpdateById(@RequestBody JSONObject data){
        JSONObject json = new JSONObject();
        json.put("data",data);
        return json;
     }


     @DeleteMapping("/deleteArticles")
    public JSONObject oldDeleteArticle(@RequestBody JSONObject data){
        JSONObject json = new JSONObject();
        json.put("result",Boolean.TRUE);
        return json;
    }



}
