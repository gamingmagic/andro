#if PACKETVER == 20160106
	packetKeys(0x40520265,0x33FE26FC,0x7136294F);
	packet(0x088a,26,clif->pPartyInvite2,2);  // CZ_PARTY_JOIN_REQ
	packet(0x035f,6,clif->pTickSend,2);  // CZ_REQUEST_TIME
	packet(0x0360,6,clif->pReqClickBuyingStore,2);  // CZ_REQ_CLICK_TO_BUYING_STORE
	packet(0x07EC,5,clif->pHomMenu,2,4);  // CZ_COMMAND_MER
	packet(0x0885,8,clif->pMoveToKafra,2,4);  // CZ_MOVE_ITEM_FROM_BODY_TO_STORE
	packet(0x0366,90,clif->pUseSkillToPosMoreInfo,2,4,6,8,10);  // CZ_USE_SKILL_TOGROUND_WITHTALKBOX
	packet(0x0368,6,clif->pSolveCharName,2);  // CZ_REQNAME_BYGID
	packet(0x0369,7,clif->pActionRequest,2,6);  // CZ_REQUEST_ACT
	packet(0x0437,5,clif->pWalkToXY,2);  // CZ_REQUEST_MOVE
	packet(0x0438,10,clif->pUseSkillToPos,2,4,6,8);  // CZ_USE_SKILL_TOGROUND
	packet(0x0811,-1,clif->pReqTradeBuyingStore,2,4,8,12);  // CZ_REQ_TRADE_BUYING_STORE
	packet(0x0815,-1,clif->pReqOpenBuyingStore,2,4,8,9,89);  // CZ_REQ_OPEN_BUYING_STORE
	packet(0x0817,2,clif->pReqCloseBuyingStore,0);  // CZ_REQ_CLOSE_BUYING_STORE
	packet(0x0835,2,clif->pSearchStoreInfoNextPage,0);  // CZ_SEARCH_STORE_INFO_NEXT_PAGE
	packet(0x0838,12,clif->pSearchStoreInfoListItemClick,2,6,10);  // CZ_SSILIST_ITEM_CLICK
	packet(0x083C,10,clif->pUseSkillToId,2,4,6);  // CZ_USE_SKILL
	packet(0x0878,36,clif->pStoragePassword,0);  // CZ_ACK_STORE_PASSWORD
	packet(0x087a,18,clif->pPartyBookingRegisterReq,2,4);  // CZ_PARTY_BOOKING_REQ_REGISTER
	packet(0x0819,-1,clif->pSearchStoreInfo,2,4,5,9,13,14,15);  // CZ_SEARCH_STORE_INFO
	packet(0x086a,6,clif->pDropItem,2,4);  // CZ_ITEM_THROW
	packet(0x094F,8,clif->pDull/*,XXX*/);  // CZ_JOIN_BATTLE_FIELD
	packet(0x0889,5,clif->pChangeDir,2,4);  // CZ_CHANGE_DIRECTION
	packet(0x0861,6,clif->pTakeItem,2);  // CZ_ITEM_PICKUP
	packet(0x087f,19,clif->pWantToConnection,2,6,10,14,18);  // CZ_ENTER
	packet(0x091D,-1,clif->pItemListWindowSelected,2,4,8);  // CZ_ITEMLISTWIN_RES
	packet(0x08A0,26,clif->pFriendsListAdd,2);  // CZ_ADD_FRIENDS
	packet(0x0891,8,clif->pMoveFromKafra,2,4);  // CZ_MOVE_ITEM_FROM_STORE_TO_BODY
	packet(0x0938,4,clif->pDull/*,XXX*/);  // CZ_GANGSI_RANK
	packet(0x096a,6,clif->pGetCharNameRequest,2);  // CZ_REQNAME
#endif

#if PACKETVER == 20180404
	packet(0x0202,26,clif->pFriendsListAdd,2);  // CZ_ADD_FRIENDS
	packet(0x022d,5,clif->pHomMenu,2,4);  // CZ_COMMAND_MER
	packet(0x023b,36,clif->pStoragePassword,0);  // CZ_ACK_STORE_PASSWORD
	packet(0x0281,4,clif->pDull/*,XXX*/);  // CZ_GANGSI_RANK
	packet(0x02c4,26,clif->pPartyInvite2,2);  // CZ_PARTY_JOIN_REQ
	packet(0x035f,5,clif->pWalkToXY,2);  // CZ_REQUEST_MOVE
	packet(0x0360,6,clif->pTickSend,2);  // CZ_REQUEST_TIME
	packet(0x0361,5,clif->pChangeDir,2,4);  // CZ_CHANGE_DIRECTION
	packet(0x0362,6,clif->pTakeItem,2);  // CZ_ITEM_PICKUP
	packet(0x0363,6,clif->pDropItem,2,4);  // CZ_ITEM_THROW
	packet(0x0364,8,clif->pMoveToKafra,2,4);  // CZ_MOVE_ITEM_FROM_BODY_TO_STORE
	packet(0x0365,8,clif->pMoveFromKafra,2,4);  // CZ_MOVE_ITEM_FROM_STORE_TO_BODY
	packet(0x0366,10,clif->pUseSkillToPos,2,4,6,8);  // CZ_USE_SKILL_TOGROUND
	packet(0x0367,90,clif->pUseSkillToPosMoreInfo,2,4,6,8,10);  // CZ_USE_SKILL_TOGROUND_WITHTALKBOX
	packet(0x0368,6,clif->pGetCharNameRequest,2);  // CZ_REQNAME
	packet(0x0369,6,clif->pSolveCharName,2);  // CZ_REQNAME_BYGID
	packet(0x0436,19,clif->pWantToConnection,2,6,10,14,18);  // CZ_ENTER
	packet(0x0437,7,clif->pActionRequest,2,6);  // CZ_REQUEST_ACT
	packet(0x0438,10,clif->pUseSkillToId,2,4,6);  // CZ_USE_SKILL
	packet(0x07e4,-1,clif->pItemListWindowSelected,2,4,8);  // CZ_ITEMLISTWIN_RES
	packet(0x07ec,8,clif->pDull/*,XXX*/);  // CZ_JOIN_BATTLE_FIELD
	packet(0x0802,18,clif->pPartyBookingRegisterReq,2,4);  // CZ_PARTY_BOOKING_REQ_REGISTER
	packet(0x0811,-1,clif->pReqOpenBuyingStore,2,4,8,9,89);  // CZ_REQ_OPEN_BUYING_STORE
	packet(0x0815,2,clif->pReqCloseBuyingStore,0);  // CZ_REQ_CLOSE_BUYING_STORE
	packet(0x0817,6,clif->pReqClickBuyingStore,2);  // CZ_REQ_CLICK_TO_BUYING_STORE
	packet(0x0819,-1,clif->pReqTradeBuyingStore,2,4,8,12);  // CZ_REQ_TRADE_BUYING_STORE
	packet(0x0835,-1,clif->pSearchStoreInfo,2,4,5,9,13,14,15);  // CZ_SEARCH_STORE_INFO
	packet(0x0838,2,clif->pSearchStoreInfoNextPage,0);  // CZ_SEARCH_STORE_INFO_NEXT_PAGE
	packet(0x083c,12,clif->pSearchStoreInfoListItemClick,2,6,10);  // CZ_SSILIST_ITEM_CLICK
#endif


#if PACKETVER == 20180621
	packet(0x0202,26,clif->pFriendsListAdd,2);  // CZ_ADD_FRIENDS
	packet(0x022d,5,clif->pHomMenu,2,4);  // CZ_COMMAND_MER
	packet(0x023b,36,clif->pStoragePassword,0);  // CZ_ACK_STORE_PASSWORD
	packet(0x0281,4,clif->pDull/*,XXX*/);  // CZ_GANGSI_RANK
	packet(0x02c4,26,clif->pPartyInvite2,2);  // CZ_PARTY_JOIN_REQ
	packet(0x035f,5,clif->pWalkToXY,2);  // CZ_REQUEST_MOVE
	packet(0x0360,6,clif->pTickSend,2);  // CZ_REQUEST_TIME
	packet(0x0361,5,clif->pChangeDir,2,4);  // CZ_CHANGE_DIRECTION
	packet(0x0362,6,clif->pTakeItem,2);  // CZ_ITEM_PICKUP
	packet(0x0363,6,clif->pDropItem,2,4);  // CZ_ITEM_THROW
	packet(0x0364,8,clif->pMoveToKafra,2,4);  // CZ_MOVE_ITEM_FROM_BODY_TO_STORE
	packet(0x0365,8,clif->pMoveFromKafra,2,4);  // CZ_MOVE_ITEM_FROM_STORE_TO_BODY
	packet(0x0366,10,clif->pUseSkillToPos,2,4,6,8);  // CZ_USE_SKILL_TOGROUND
	packet(0x0367,90,clif->pUseSkillToPosMoreInfo,2,4,6,8,10);  // CZ_USE_SKILL_TOGROUND_WITHTALKBOX
	packet(0x0368,6,clif->pGetCharNameRequest,2);  // CZ_REQNAME
	packet(0x0369,6,clif->pSolveCharName,2);  // CZ_REQNAME_BYGID
	packet(0x0436,19,clif->pWantToConnection,2,6,10,14,18);  // CZ_ENTER
	packet(0x0437,7,clif->pActionRequest,2,6);  // CZ_REQUEST_ACT
	packet(0x0438,10,clif->pUseSkillToId,2,4,6);  // CZ_USE_SKILL
	packet(0x07e4,-1,clif->pItemListWindowSelected,2,4,8);  // CZ_ITEMLISTWIN_RES
	packet(0x07ec,8,clif->pDull/*,XXX*/);  // CZ_JOIN_BATTLE_FIELD
	packet(0x0802,18,clif->pPartyBookingRegisterReq,2,4);  // CZ_PARTY_BOOKING_REQ_REGISTER
	packet(0x0811,-1,clif->pReqOpenBuyingStore,2,4,8,9,89);  // CZ_REQ_OPEN_BUYING_STORE
	packet(0x0815,2,clif->pReqCloseBuyingStore,0);  // CZ_REQ_CLOSE_BUYING_STORE
	packet(0x0817,6,clif->pReqClickBuyingStore,2);  // CZ_REQ_CLICK_TO_BUYING_STORE
	packet(0x0819,-1,clif->pReqTradeBuyingStore,2,4,8,12);  // CZ_REQ_TRADE_BUYING_STORE
	packet(0x0835,-1,clif->pSearchStoreInfo,2,4,5,9,13,14,15);  // CZ_SEARCH_STORE_INFO
	packet(0x0838,2,clif->pSearchStoreInfoNextPage,0);  // CZ_SEARCH_STORE_INFO_NEXT_PAGE
	packet(0x083c,12,clif->pSearchStoreInfoListItemClick,2,6,10);  // CZ_SSILIST_ITEM_CLICK
#endif


#if PACKETVER == 20190116
	packet(0x0202,26,clif->pFriendsListAdd,2);  // CZ_ADD_FRIENDS
	packet(0x022d,5,clif->pHomMenu,2,4);  // CZ_COMMAND_MER
	packet(0x023b,36,clif->pStoragePassword,0);  // CZ_ACK_STORE_PASSWORD
	packet(0x0281,4,clif->pDull/*,XXX*/);  // CZ_GANGSI_RANK
	packet(0x02c4,26,clif->pPartyInvite2,2);  // CZ_PARTY_JOIN_REQ
	packet(0x035f,5,clif->pWalkToXY,2);  // CZ_REQUEST_MOVE
	packet(0x0360,6,clif->pTickSend,2);  // CZ_REQUEST_TIME
	packet(0x0361,5,clif->pChangeDir,2,4);  // CZ_CHANGE_DIRECTION
	packet(0x0362,6,clif->pTakeItem,2);  // CZ_ITEM_PICKUP
	packet(0x0363,6,clif->pDropItem,2,4);  // CZ_ITEM_THROW
	packet(0x0364,8,clif->pMoveToKafra,2,4);  // CZ_MOVE_ITEM_FROM_BODY_TO_STORE
	packet(0x0365,8,clif->pMoveFromKafra,2,4);  // CZ_MOVE_ITEM_FROM_STORE_TO_BODY
	packet(0x0366,10,clif->pUseSkillToPos,2,4,6,8);  // CZ_USE_SKILL_TOGROUND
	packet(0x0367,90,clif->pUseSkillToPosMoreInfo,2,4,6,8,10);  // CZ_USE_SKILL_TOGROUND_WITHTALKBOX
	packet(0x0368,6,clif->pGetCharNameRequest,2);  // CZ_REQNAME
	packet(0x0369,6,clif->pSolveCharName,2);  // CZ_REQNAME_BYGID
	packet(0x0436,19,clif->pWantToConnection,2,6,10,14,18);  // CZ_ENTER
	packet(0x0437,7,clif->pActionRequest,2,6);  // CZ_REQUEST_ACT
	packet(0x0438,10,clif->pUseSkillToId,2,4,6);  // CZ_USE_SKILL
	packet(0x07e4,-1,clif->pItemListWindowSelected,2,4,8);  // CZ_ITEMLISTWIN_RES
	packet(0x07ec,8,clif->pDull/*,XXX*/);  // CZ_JOIN_BATTLE_FIELD
	packet(0x0802,18,clif->pPartyBookingRegisterReq,2,4);  // CZ_PARTY_BOOKING_REQ_REGISTER
	packet(0x0811,-1,clif->pReqOpenBuyingStore,2,4,8,9,89);  // CZ_REQ_OPEN_BUYING_STORE
	packet(0x0815,2,clif->pReqCloseBuyingStore,0);  // CZ_REQ_CLOSE_BUYING_STORE
	packet(0x0817,6,clif->pReqClickBuyingStore,2);  // CZ_REQ_CLICK_TO_BUYING_STORE
	packet(0x0819,-1,clif->pReqTradeBuyingStore,2,4,8,12);  // CZ_REQ_TRADE_BUYING_STORE
	packet(0x0835,-1,clif->pSearchStoreInfo,2,4,5,9,13,14,15);  // CZ_SEARCH_STORE_INFO
	packet(0x0838,2,clif->pSearchStoreInfoNextPage,0);  // CZ_SEARCH_STORE_INFO_NEXT_PAGE
	packet(0x083c,12,clif->pSearchStoreInfoListItemClick,2,6,10);  // CZ_SSILIST_ITEM_CLICK
#endif
