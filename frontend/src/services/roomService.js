import request from '~/utils/request';
export const findRoomByCode = async () => {
    try {
        const res = await request.get(`users`);
        return res.data;
    } catch (error) {
      
    }
};
