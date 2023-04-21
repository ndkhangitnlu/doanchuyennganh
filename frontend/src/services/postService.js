import request from "~/utils/request";
export const findAllPosts = async (k) => {
  try {
    const res = await request.get(`posts`);
    return res.data;
  } catch (error) {
    console.log("this alert will detlete when deploy (alert search 404)");
    console.log(error.response.data); // delete when deploy
  }
};
