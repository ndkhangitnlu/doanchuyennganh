import request from '~/utils/request';
export const findRoomByCode = async (code) => {
    try {
        const res = await request.get(  `/room/getARoom/${code}`);
        return res.data;
    } catch (error) {
      
    }
};
