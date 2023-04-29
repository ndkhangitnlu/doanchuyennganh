import request from '~/utils/request';
export const findRoomByCode = async (code) => {
    try {
        const res = await request.get(`/room/getARoom/${code}`);
        return res.data;
    } catch (error) {}
};
export const saveRoom = async (name, timeStart, timeEnd, status) => {
    try {
        const res = await request.post(`/room/addARoom`, {
            room_name: name,
            start_at: timeStart,
            time: timeEnd,
            status: status,
        });
        return res.data;
    } catch (error) {}
};
