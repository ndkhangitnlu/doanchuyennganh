import request from '~/utils/request';
export const findQuestionByCode = async (code) => {
    try {
        const res = await request.get(`todos/${code}`);
        return res.data;
    } catch (error) {
       
    }
};
