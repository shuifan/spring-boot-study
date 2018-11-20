package com.example.anotherstudy;

import com.example.anotherstudy.feign.ExampleServiceFeignClient;
import okhttp3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnotherstudyApplicationTests {

	@Autowired
	private ExampleServiceFeignClient exampleServiceFeignClient;

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void test() throws IOException, InterruptedException {

//		String forObject = restTemplate.getForObject("https://api.youku.com/videos/show.json?client_id=0dd6ec92c7ed1b5b&video_id=XMzM4NTA1MTg2OA==", String.class);
//		System.out.println(forObject);

		// step 1: 创建 OkHttpClient 对象
		OkHttpClient okHttpClient = new OkHttpClient();

		// step 2： 创建一个请求，不指定请求方法时默认是GET。
		Request.Builder requestBuilder = new Request.Builder().url("https://api.youku.com/videos/show.json?client_id=0dd6ec92c7ed1b5b&video_id=XMzM4NTA1MTg2OA==");
		//可以省略，默认是GET请求
		requestBuilder.method("GET",null);

		// step 3：创建 Call 对象
		Call call = okHttpClient.newCall(requestBuilder.build());

//		step 4: 开始异步请求
		call.enqueue(new Callback() {
			@Override
			public void onFailure(Call call, IOException e) {
				// TODO: 17-1-4  请求失败
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				// TODO: 17-1-4 请求成功
				//获得返回体
				ResponseBody body = response.body();
				System.out.println(body.string());
			}
		});

		while (true){
			System.out.println(1);
			Thread.sleep(10000);
		}


	}

}
