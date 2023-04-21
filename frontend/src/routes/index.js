import config from "~/config";
import Home from "~/page/Home/Home";
import SignIn from "~/page/SignIn/SignIn";
import SignUp from "~/page/SignUp/SignUp";

const publicRoutes = [
  { path: config.routes.home, component: Home },
  { path: config.routes.signIn, component: SignIn },
  { path: config.routes.signUp, component: SignUp },
];
const privateRoutes = [];
export { publicRoutes, privateRoutes };
