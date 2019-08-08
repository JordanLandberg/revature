import express from 'express';
import * as reimbursementDao from '../daos/reimbursements.dao';
import { authMiddleware } from '../middleware/auth.middleware';

export const reimbursementsRouter = express.Router();

/**
 * /reimbursements/status/:id
 * find all reimbursements based off status id
 */
reimbursementsRouter.get('/status/:statusId', [
    authMiddleware('admin', 'finance-manager'),
    async (req, res) => {
        let id = req.params.statusId;
        const users = await reimbursementDao.findReimbursementByStatusId(id)
        res.json(users);
    }]);

/**
 * /reimbursements/author/:userId
 * find all reimbursements based off users id
 */
reimbursementsRouter.get('/author/:userId', [
    authMiddleware('admin', 'finance-manager'),
    async (req, res) => {
        let userId = req.params.userId;
        const users = await reimbursementDao.findReimbursementByAuthorId(userId);
        res.json(users);
    }]);

/**
 * /reimbursements
 * create a reimbursement
 */
reimbursementsRouter.post('', async (req, res) => {
    const reimbursement = req.body;
    const createdReimbursement = await reimbursementDao.createReimbursement(reimbursement);
    res.json(createdReimbursement);
    res.status(201);
});

/**
 * /reimbursements
 * update a reimbursement
 */
reimbursementsRouter.patch('', [
    authMiddleware('admin'),
    async (req, res) => {
        const reimbursement = req.body;
        const updatedReimbursement = await reimbursementDao.updateReimbursement(reimbursement);
        res.json(updatedReimbursement);
    }]);