import config from '~/config';
import CreateRoom from '~/page/CreateRoom/CreateRoom';
import Home from '~/page/Home/Home';
// import Room from '~/page/Room/Room';
import SignIn from '~/page/SignIn/SignIn';
import SignUp from '~/page/SignUp/SignUp';

const publicRoutes = [
    { path: config.routes.home, component: Home },
    { path: config.routes.signIn, component: SignIn },
    { path: config.routes.signUp, component: SignUp },
    { path: config.routes.createRoom, component: CreateRoom },
    // { path: config.routes.room, component: Room },

];
const privateRoutes = [];
export { publicRoutes, privateRoutes };
