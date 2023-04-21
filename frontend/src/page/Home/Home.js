import { useEffect } from "react";
import * as postService from "~/services/postService";

function Home() {
  useEffect(() => {
    const fetchApi = async () => {
      const result = await postService.findAllPosts();
      console.log(result);
    };
    fetchApi();
  }, []);
  return <h1 className="text-[#cc4a4a]">Trang chủ</h1>;
}

export default Home;
