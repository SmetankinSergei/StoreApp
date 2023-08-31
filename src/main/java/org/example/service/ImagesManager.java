package org.example.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesManager {

    // panels
    private static BufferedImage startPanelImg;
    private static BufferedImage storePanelImg;
    private static BufferedImage cartPanelImg;
    private static BufferedImage ordersPanelImg;
    private static BufferedImage contactPanelImg;
    private static BufferedImage recallsPanelImg;
    private static BufferedImage exitPanelImg;
    private static BufferedImage itemPanelImg;
    private static BufferedImage productsPanelImg;
    private static BufferedImage searchPanelImg;
    private static BufferedImage productInfoPanelImg;
    private static BufferedImage emptyCartProductsPanel;
    private static BufferedImage filledCartProductsPanel;

    // main buttons
    private static BufferedImage enterButtonImg;
    private static BufferedImage activeEnterButtonImg;
    private static BufferedImage pressedEnterButtonImg;
    private static BufferedImage storeButtonImg;
    private static BufferedImage activeStoreButtonImg;
    private static BufferedImage pressedStoreButtonImg;
    private static BufferedImage cartButtonImg;
    private static BufferedImage activeCartButtonImg;
    private static BufferedImage pressedCartButtonImg;
    private static BufferedImage ordersButtonImg;
    private static BufferedImage activeOrdersButtonImg;
    private static BufferedImage pressedOrdersButtonImg;
    private static BufferedImage contactButtonImg;
    private static BufferedImage activeContactButtonImg;
    private static BufferedImage pressedContactButtonImg;
    private static BufferedImage recallsButtonImg;
    private static BufferedImage activeRecallsButtonImg;
    private static BufferedImage pressedRecallsButtonImg;
    private static BufferedImage exitButtonImg;
    private static BufferedImage activeExitButtonImg;
    private static BufferedImage pressedExitButtonImg;

    // start panel
    private static BufferedImage authButtonImg;
    private static BufferedImage activeAuthButtonImg;
    private static BufferedImage pressedAuthButtonImg;
    private static BufferedImage regButtonImg;
    private static BufferedImage activeRegButtonImg;
    private static BufferedImage pressedRegButtonImg;
    private static BufferedImage confirmButtonImg;
    private static BufferedImage activeConfirmButtonImg;
    private static BufferedImage pressedConfirmButtonImg;
    private static BufferedImage backFromAuthButtonImg;
    private static BufferedImage activeBackFromAuthButtonImg;
    private static BufferedImage pressedBackFromAuthButtonImg;
    private static BufferedImage guestButtonImg;
    private static BufferedImage activeGuestButtonImg;
    private static BufferedImage pressedGuestButtonImg;
    private static BufferedImage exitGuestModeButtonImg;
    private static BufferedImage activeExitGuestModeButtonImg;
    private static BufferedImage pressedExitGuestModeButtonImg;
    private static BufferedImage authPanelImg;
    private static BufferedImage regPanelImg;
    private static BufferedImage blockPanelImg;
    private static BufferedImage blockForGuestPanelImg;
    private static BufferedImage guestWarningPanelImg;
    private static BufferedImage warningExitGuestModePanelImg;
    private static BufferedImage guestNoButtonImg;
    private static BufferedImage activeGuestNoButtonImg;
    private static BufferedImage pressedGuestNoButtonImg;
    private static BufferedImage guestYesButtonImg;
    private static BufferedImage activeGuestYesButtonImg;
    private static BufferedImage pressedGuestYesButtonImg;
    private static BufferedImage formFieldImg;

    // store panel buttons
    private static BufferedImage settingsButtonImg;
    private static BufferedImage activeSettingsButtonImg;
    private static BufferedImage pressedSettingsButtonImg;
    private static BufferedImage leftArrowButtonImg;
    private static BufferedImage activeLeftArrowButtonImg;
    private static BufferedImage pressedLeftArrowButtonImg;
    private static BufferedImage rightArrowButtonImg;
    private static BufferedImage activeRightArrowButtonImg;
    private static BufferedImage pressedRightArrowButtonImg;
    private static BufferedImage closeProductInfoButtonImg;
    private static BufferedImage activeCloseProductInfoButtonImg;
    private static BufferedImage pressedCloseProductInfoButtonImg;

    // cart panel buttons
    private static BufferedImage buyButtonImg;
    private static BufferedImage activeBuyButtonImg;
    private static BufferedImage pressedBuyButtonImg;
    private static BufferedImage dropAllButtonImg;
    private static BufferedImage activeDropAllButtonImg;
    private static BufferedImage pressedDropAllButtonImg;

    // item panel buttons
    private static BufferedImage productInfoButtonImg;
    private static BufferedImage activeProductInfoButtonImg;
    private static BufferedImage pressedProductInfoButtonImg;
    private static BufferedImage addButtonImg;
    private static BufferedImage activeAddButtonImg;
    private static BufferedImage pressedAddButtonImg;
    private static BufferedImage dropButtonImg;
    private static BufferedImage activeDropButtonImg;
    private static BufferedImage pressedDropButtonImg;

    // search panel buttons
    private static BufferedImage searchButtonImg;
    private static BufferedImage activeSearchButtonImg;
    private static BufferedImage pressedSearchButtonImg;
    private static BufferedImage searchOptionsButtonImg;
    private static BufferedImage activeSearchOptionsButtonImg;
    private static BufferedImage pressedSearchOptionsButtonImg;
    private static BufferedImage authorSearchLabelImg;
    private static BufferedImage bookSearchLabelImg;
    private static BufferedImage genreSearchLabelImg;
    private static BufferedImage idSearchLabelImg;
    private static BufferedImage allSearchLabelImg;
    private static BufferedImage searchFieldPanelImg;

    // search options panel
    private static BufferedImage searchOptionsPanelImg;
    private static BufferedImage bookButtonImg;
    private static BufferedImage activeBookButtonImg;
    private static BufferedImage pressedBookButtonImg;
    private static BufferedImage authorButtonImg;
    private static BufferedImage activeAuthorButtonImg;
    private static BufferedImage pressedAuthorButtonImg;
    private static BufferedImage genreButtonImg;
    private static BufferedImage activeGenreButtonImg;
    private static BufferedImage pressedGenreButtonImg;
    private static BufferedImage idButtonImg;
    private static BufferedImage activeIdButtonImg;
    private static BufferedImage pressedIdButtonImg;
    private static BufferedImage allButtonImg;
    private static BufferedImage activeAllButtonImg;
    private static BufferedImage pressedAllButtonImg;

    // numbers
    private static BufferedImage one;
    private static BufferedImage two;
    private static BufferedImage three;
    private static BufferedImage four;
    private static BufferedImage five;
    private static BufferedImage six;
    private static BufferedImage seven;
    private static BufferedImage eight;
    private static BufferedImage nine;
    private static BufferedImage zero;

    // alphabet
    //up
    private static BufferedImage AImg;
    private static BufferedImage BImg;
    private static BufferedImage CImg;
    private static BufferedImage DImg;
    private static BufferedImage EImg;
    private static BufferedImage FImg;
    private static BufferedImage GImg;
    private static BufferedImage HImg;
    private static BufferedImage IImg;
    private static BufferedImage JImg;
    private static BufferedImage KImg;
    private static BufferedImage LImg;
    private static BufferedImage MImg;
    private static BufferedImage NImg;
    private static BufferedImage OImg;
    private static BufferedImage PImg;
    private static BufferedImage QImg;
    private static BufferedImage RImg;
    private static BufferedImage SImg;
    private static BufferedImage TImg;
    private static BufferedImage UImg;
    private static BufferedImage VImg;
    private static BufferedImage WImg;
    private static BufferedImage XImg;
    private static BufferedImage YImg;
    private static BufferedImage ZImg;
    // low
    private static BufferedImage aImg;
    private static BufferedImage bImg;
    private static BufferedImage cImg;
    private static BufferedImage dImg;
    private static BufferedImage eImg;
    private static BufferedImage fImg;
    private static BufferedImage gImg;
    private static BufferedImage hImg;
    private static BufferedImage iImg;
    private static BufferedImage jImg;
    private static BufferedImage kImg;
    private static BufferedImage lImg;
    private static BufferedImage mImg;
    private static BufferedImage nImg;
    private static BufferedImage oImg;
    private static BufferedImage pImg;
    private static BufferedImage qImg;
    private static BufferedImage rImg;
    private static BufferedImage sImg;
    private static BufferedImage tImg;
    private static BufferedImage uImg;
    private static BufferedImage vImg;
    private static BufferedImage wImg;
    private static BufferedImage xImg;
    private static BufferedImage yImg;
    private static BufferedImage zImg;

    // symbols
    private static BufferedImage pointImg;
    private static BufferedImage spaceImg;

    public static void loadImages() {
        try {
            // panels
            startPanelImg = ImageIO.read(new File("img/panels/start_panel/start_panel.png"));
            storePanelImg = ImageIO.read(new File("img/panels/store_panel/store_panel.png"));
            cartPanelImg = ImageIO.read(new File("img/panels/cart_panel/cart_panel.png"));
            ordersPanelImg = ImageIO.read(new File("img/panels/orders_panel/orders_panel.png"));
            contactPanelImg = ImageIO.read(new File("img/panels/contact_panel/contact_panel.png"));
            recallsPanelImg = ImageIO.read(new File("img/panels/recalls_panel/recalls_panel.png"));
            exitPanelImg = ImageIO.read(new File("img/panels/exit_panel/exit_panel.png"));
            itemPanelImg = ImageIO.read(new File("img/panels/store_panel/products_panel/store_item.png"));
            productsPanelImg = ImageIO.read(new File("img/panels/store_panel/products_panel/products_panel.png"));
            searchPanelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/search_panel.png"));
            productInfoPanelImg = ImageIO.read(new File("img/panels/store_panel/products_panel/product_info_panel.png"));
            emptyCartProductsPanel = ImageIO.read(new File("img/panels/cart_panel/cart_products_panel/empty_cart_products_panel.png"));
            filledCartProductsPanel = ImageIO.read(new File("img/panels/cart_panel/cart_products_panel/filled_cart_products_panel.png"));

            // main buttons
            enterButtonImg = ImageIO.read(new File("img/panels/main_buttons/enter_button.png"));
            activeEnterButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_enter_button.png"));
            pressedEnterButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_enter_button.png"));
            storeButtonImg = ImageIO.read(new File("img/panels/main_buttons/store_button.png"));
            activeStoreButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_store_button.png"));
            pressedStoreButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_store_button.png"));
            cartButtonImg = ImageIO.read(new File("img/panels/main_buttons/cart_button.png"));
            activeCartButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_cart_button.png"));
            pressedCartButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_cart_button.png"));
            ordersButtonImg = ImageIO.read(new File("img/panels/main_buttons/orders_button.png"));
            activeOrdersButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_orders_button.png"));
            pressedOrdersButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_orders_button.png"));
            contactButtonImg = ImageIO.read(new File("img/panels/main_buttons/contact_button.png"));
            activeContactButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_contact_button.png"));
            pressedContactButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_contact_button.png"));
            recallsButtonImg = ImageIO.read(new File("img/panels/main_buttons/recalls_button.png"));
            activeRecallsButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_recalls_button.png"));
            pressedRecallsButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_recalls_button.png"));
            exitButtonImg = ImageIO.read(new File("img/panels/main_buttons/exit_button.png"));
            activeExitButtonImg = ImageIO.read(new File("img/panels/main_buttons/active_exit_button.png"));
            pressedExitButtonImg = ImageIO.read(new File("img/panels/main_buttons/pressed_exit_button.png"));

            // start panel
            authButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_button.png"));
            activeAuthButtonImg = ImageIO.read(new File("img/panels/start_panel/active_auth_button.png"));
            pressedAuthButtonImg = ImageIO.read(new File("img/panels/start_panel/pressed_auth_button.png"));
            regButtonImg = ImageIO.read(new File("img/panels/start_panel/reg_button.png"));
            activeRegButtonImg = ImageIO.read(new File("img/panels/start_panel/active_reg_button.png"));
            pressedRegButtonImg = ImageIO.read(new File("img/panels/start_panel/pressed_reg_button.png"));
            guestButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_button.png"));
            activeGuestButtonImg = ImageIO.read(new File("img/panels/start_panel/active_guest_button.png"));
            pressedGuestButtonImg = ImageIO.read(new File("img/panels/start_panel/pressed_guest_button.png"));
            exitGuestModeButtonImg = ImageIO.read(new File("img/panels/start_panel/exit_guest_mode_button.png"));
            activeExitGuestModeButtonImg = ImageIO.read(new File("img/panels/start_panel/active_exit_guest_mode_button.png"));
            pressedExitGuestModeButtonImg = ImageIO.read(new File("img/panels/start_panel/pressed_exit_guest_mode_button.png"));
            authPanelImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/auth_panel.png"));
            regPanelImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/reg_panel.png"));
            confirmButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/confirm_button.png"));
            activeConfirmButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/active_confirm_button.png"));
            pressedConfirmButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/pressed_confirm_button.png"));
            backFromAuthButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/back_from_auth_button.png"));
            activeBackFromAuthButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/active_back_from_auth_button.png"));
            pressedBackFromAuthButtonImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/pressed_back_from_auth_button.png"));
            blockPanelImg = ImageIO.read(new File("img/panels/start_panel/block_panel.png"));
            blockForGuestPanelImg = ImageIO.read(new File("img/panels/start_panel/block_for_guest_panel.png"));
            guestWarningPanelImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/guest_warning_panel.png"));
            warningExitGuestModePanelImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/warning_exit_guest_mode_panel.png"));
            guestNoButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/guest_no_button.png"));
            activeGuestNoButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/active_guest_no_button.png"));
            pressedGuestNoButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/pressed_guest_no_button.png"));
            guestYesButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/guest_yes_button.png"));
            activeGuestYesButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/active_guest_yes_button.png"));
            pressedGuestYesButtonImg = ImageIO.read(new File("img/panels/start_panel/guest_warning_panel/pressed_guest_yes_button.png"));
            formFieldImg = ImageIO.read(new File("img/panels/start_panel/auth_panel/form_field.png"));

            // store panel buttons
            settingsButtonImg = ImageIO.read(new File("img/panels/store_panel/settings_button.png"));
            activeSettingsButtonImg = ImageIO.read(new File("img/panels/store_panel/active_settings_button.png"));
            pressedSettingsButtonImg = ImageIO.read(new File("img/panels/store_panel/pressed_settings_button.png"));
            leftArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/left_arrow_button.png"));
            activeLeftArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/active_left_arrow_button.png"));
            pressedLeftArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/pressed_left_arrow_button.png"));
            rightArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/right_arrow_button.png"));
            activeRightArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/active_right_arrow_button.png"));
            pressedRightArrowButtonImg = ImageIO.read(new File("img/panels/store_panel/pressed_right_arrow_button.png"));
            closeProductInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/close_product_info_button.png"));
            activeCloseProductInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/active_close_product_info_button.png"));
            pressedCloseProductInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/pressed_close_product_info_button.png"));

            // cart panel buttons
            buyButtonImg = ImageIO.read(new File("img/panels/cart_panel/buy_button.png"));
            activeBuyButtonImg = ImageIO.read(new File("img/panels/cart_panel/active_buy_button.png"));
            pressedBuyButtonImg = ImageIO.read(new File("img/panels/cart_panel/pressed_buy_button.png"));
            dropAllButtonImg = ImageIO.read(new File("img/panels/cart_panel/drop_all_button.png"));
            activeDropAllButtonImg = ImageIO.read(new File("img/panels/cart_panel/active_drop_all_button.png"));
            pressedDropAllButtonImg = ImageIO.read(new File("img/panels/cart_panel/pressed_drop_all_button.png"));

            // item panel buttons
            productInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/product_info_button.png"));
            activeProductInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/active_product_info_button.png"));
            pressedProductInfoButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/pressed_product_info_button.png"));
            addButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/add_button.png"));
            activeAddButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/active_add_button.png"));
            pressedAddButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/pressed_add_button.png"));
            dropButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/drop_button.png"));
            activeDropButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/active_drop_button.png"));
            pressedDropButtonImg = ImageIO.read(new File("img/panels/store_panel/products_panel/pressed_drop_button.png"));

            // search panel buttons
            searchButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/search_button.png"));
            activeSearchButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/active_search_button.png"));
            pressedSearchButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/pressed_search_button.png"));
            searchOptionsButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/search_options_button.png"));
            activeSearchOptionsButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/active_search_options_button.png"));
            pressedSearchOptionsButtonImg = ImageIO.read(new File("img/panels/store_panel/search_panel/pressed_search_options_button.png"));
            authorSearchLabelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/author_search_label.png"));
            bookSearchLabelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/book_search_label.png"));
            genreSearchLabelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/genre_search_label.png"));
            idSearchLabelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/id_search_label.png"));
            allSearchLabelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/all_search_label.png"));
            searchFieldPanelImg = ImageIO.read(new File("img/panels/store_panel/search_panel/search_field_panel.png"));

            // search options panel
            searchOptionsPanelImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/search_options_panel.png"));
            bookButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/book_button.png"));
            activeBookButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/active_book_button.png"));
            pressedBookButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/pressed_book_button.png"));
            authorButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/author_button.png"));
            activeAuthorButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/active_author_button.png"));
            pressedAuthorButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/pressed_author_button.png"));
            genreButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/genre_button.png"));
            activeGenreButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/active_genre_button.png"));
            pressedGenreButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/pressed_genre_button.png"));
            idButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/id_button.png"));
            activeIdButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/active_id_button.png"));
            pressedIdButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/pressed_id_button.png"));
            allButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/all_button.png"));
            activeAllButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/active_all_button.png"));
            pressedAllButtonImg = ImageIO.read(new File("img/panels/store_panel/search_options_panel/pressed_all_button.png"));

            // numbers
            one = ImageIO.read(new File("img/numbers/1.png"));
            two = ImageIO.read(new File("img/numbers/2.png"));
            three = ImageIO.read(new File("img/numbers/3.png"));
            four = ImageIO.read(new File("img/numbers/4.png"));
            five = ImageIO.read(new File("img/numbers/5.png"));
            six = ImageIO.read(new File("img/numbers/6.png"));
            seven = ImageIO.read(new File("img/numbers/7.png"));
            eight = ImageIO.read(new File("img/numbers/8.png"));
            nine = ImageIO.read(new File("img/numbers/9.png"));
            zero = ImageIO.read(new File("img/numbers/0.png"));

            // alphabet
            // up
            AImg = ImageIO.read(new File("img/alphabet/up/up_a.png"));
            BImg = ImageIO.read(new File("img/alphabet/up/up_b.png"));
            CImg = ImageIO.read(new File("img/alphabet/up/up_c.png"));
            DImg = ImageIO.read(new File("img/alphabet/up/up_d.png"));
            EImg = ImageIO.read(new File("img/alphabet/up/up_e.png"));
            FImg = ImageIO.read(new File("img/alphabet/up/up_f.png"));
            GImg = ImageIO.read(new File("img/alphabet/up/up_g.png"));
            HImg = ImageIO.read(new File("img/alphabet/up/up_h.png"));
            IImg = ImageIO.read(new File("img/alphabet/up/up_i.png"));
            JImg = ImageIO.read(new File("img/alphabet/up/up_j.png"));
            KImg = ImageIO.read(new File("img/alphabet/up/up_k.png"));
            LImg = ImageIO.read(new File("img/alphabet/up/up_l.png"));
            MImg = ImageIO.read(new File("img/alphabet/up/up_m.png"));
            NImg = ImageIO.read(new File("img/alphabet/up/up_n.png"));
            OImg = ImageIO.read(new File("img/alphabet/up/up_o.png"));
            PImg = ImageIO.read(new File("img/alphabet/up/up_p.png"));
            QImg = ImageIO.read(new File("img/alphabet/up/up_q.png"));
            RImg = ImageIO.read(new File("img/alphabet/up/up_r.png"));
            SImg = ImageIO.read(new File("img/alphabet/up/up_s.png"));
            TImg = ImageIO.read(new File("img/alphabet/up/up_t.png"));
            UImg = ImageIO.read(new File("img/alphabet/up/up_u.png"));
            VImg = ImageIO.read(new File("img/alphabet/up/up_v.png"));
            WImg = ImageIO.read(new File("img/alphabet/up/up_w.png"));
            XImg = ImageIO.read(new File("img/alphabet/up/up_x.png"));
            YImg = ImageIO.read(new File("img/alphabet/up/up_y.png"));
            ZImg = ImageIO.read(new File("img/alphabet/up/up_z.png"));
            // low
            aImg = ImageIO.read(new File("img/alphabet/low/low_a.png"));
            bImg = ImageIO.read(new File("img/alphabet/low/low_b.png"));
            cImg = ImageIO.read(new File("img/alphabet/low/low_c.png"));
            dImg = ImageIO.read(new File("img/alphabet/low/low_d.png"));
            eImg = ImageIO.read(new File("img/alphabet/low/low_e.png"));
            fImg = ImageIO.read(new File("img/alphabet/low/low_f.png"));
            gImg = ImageIO.read(new File("img/alphabet/low/low_g.png"));
            hImg = ImageIO.read(new File("img/alphabet/low/low_h.png"));
            iImg = ImageIO.read(new File("img/alphabet/low/low_i.png"));
            jImg = ImageIO.read(new File("img/alphabet/low/low_j.png"));
            kImg = ImageIO.read(new File("img/alphabet/low/low_k.png"));
            lImg = ImageIO.read(new File("img/alphabet/low/low_l.png"));
            mImg = ImageIO.read(new File("img/alphabet/low/low_m.png"));
            nImg = ImageIO.read(new File("img/alphabet/low/low_n.png"));
            oImg = ImageIO.read(new File("img/alphabet/low/low_o.png"));
            pImg = ImageIO.read(new File("img/alphabet/low/low_p.png"));
            qImg = ImageIO.read(new File("img/alphabet/low/low_q.png"));
            rImg = ImageIO.read(new File("img/alphabet/low/low_r.png"));
            sImg = ImageIO.read(new File("img/alphabet/low/low_s.png"));
            tImg = ImageIO.read(new File("img/alphabet/low/low_t.png"));
            uImg = ImageIO.read(new File("img/alphabet/low/low_u.png"));
            vImg = ImageIO.read(new File("img/alphabet/low/low_v.png"));
            wImg = ImageIO.read(new File("img/alphabet/low/low_w.png"));
            xImg = ImageIO.read(new File("img/alphabet/low/low_x.png"));
            yImg = ImageIO.read(new File("img/alphabet/low/low_y.png"));
            zImg = ImageIO.read(new File("img/alphabet/low/low_z.png"));

            // symbols
            pointImg = ImageIO.read(new File("img/alphabet/symbols/point.png"));
            spaceImg = ImageIO.read(new File("img/alphabet/symbols/space.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // panels
    public static BufferedImage getStartPanelImg() {
        return startPanelImg;
    }

    public static BufferedImage getStorePanelImg() {
        return storePanelImg;
    }

    public static BufferedImage getCartPanelImg() {
        return cartPanelImg;
    }

    public static BufferedImage getOrdersPanelImg() {
        return ordersPanelImg;
    }

    public static BufferedImage getContactPanelImg() {
        return contactPanelImg;
    }

    public static BufferedImage getRecallsPanelImg() {
        return recallsPanelImg;
    }

    public static BufferedImage getExitPanelImg() {
        return exitPanelImg;
    }

    public static BufferedImage getItemPanelImg() {
        return itemPanelImg;
    }

    public static BufferedImage getProductsPanelImg() {
        return productsPanelImg;
    }

    public static BufferedImage getSearchPanelImg() {
        return searchPanelImg;
    }

    public static BufferedImage getProductInfoPanelImg() {
        return productInfoPanelImg;
    }

    public static BufferedImage getEmptyCartProductsPanel() {
        return emptyCartProductsPanel;
    }

    public static BufferedImage getFilledCartProductsPanel() {
        return filledCartProductsPanel;
    }

    // main buttons

    public static BufferedImage getEnterButtonImg() {
        return enterButtonImg;
    }

    public static BufferedImage getActiveEnterButtonImg() {
        return activeEnterButtonImg;
    }

    public static BufferedImage getPressedEnterButtonImg() {
        return pressedEnterButtonImg;
    }

    public static BufferedImage getStoreButtonImg() {
        return storeButtonImg;
    }

    public static BufferedImage getActiveStoreButtonImg() {
        return activeStoreButtonImg;
    }

    public static BufferedImage getPressedStoreButtonImg() {
        return pressedStoreButtonImg;
    }

    public static BufferedImage getCartButtonImg() {
        return cartButtonImg;
    }

    public static BufferedImage getActiveCartButtonImg() {
        return activeCartButtonImg;
    }

    public static BufferedImage getPressedCartButtonImg() {
        return pressedCartButtonImg;
    }

    public static BufferedImage getOrdersButtonImg() {
        return ordersButtonImg;
    }

    public static BufferedImage getActiveOrdersButtonImg() {
        return activeOrdersButtonImg;
    }

    public static BufferedImage getPressedOrdersButtonImg() {
        return pressedOrdersButtonImg;
    }

    public static BufferedImage getContactButtonImg() {
        return contactButtonImg;
    }

    public static BufferedImage getActiveContactButtonImg() {
        return activeContactButtonImg;
    }

    public static BufferedImage getPressedContactButtonImg() {
        return pressedContactButtonImg;
    }

    public static BufferedImage getRecallsButtonImg() {
        return recallsButtonImg;
    }

    public static BufferedImage getActiveRecallsButtonImg() {
        return activeRecallsButtonImg;
    }

    public static BufferedImage getPressedRecallsButtonImg() {
        return pressedRecallsButtonImg;
    }

    public static BufferedImage getExitButtonImg() {
        return exitButtonImg;
    }

    public static BufferedImage getActiveExitButtonImg() {
        return activeExitButtonImg;
    }

    public static BufferedImage getPressedExitButtonImg() {
        return pressedExitButtonImg;
    }

    // start panel

    public static BufferedImage getAuthButtonImg() {
        return authButtonImg;
    }

    public static BufferedImage getActiveAuthButtonImg() {
        return activeAuthButtonImg;
    }

    public static BufferedImage getPressedAuthButtonImg() {
        return pressedAuthButtonImg;
    }

    public static BufferedImage getRegButtonImg() {
        return regButtonImg;
    }

    public static BufferedImage getActiveRegButtonImg() {
        return activeRegButtonImg;
    }

    public static BufferedImage getPressedRegButtonImg() {
        return pressedRegButtonImg;
    }

    public static BufferedImage getConfirmButtonImg() {
        return confirmButtonImg;
    }

    public static BufferedImage getActiveConfirmButtonImg() {
        return activeConfirmButtonImg;
    }

    public static BufferedImage getPressedConfirmButtonImg() {
        return pressedConfirmButtonImg;
    }

    public static BufferedImage getBackFromAuthButtonImg() {
        return backFromAuthButtonImg;
    }

    public static BufferedImage getActiveBackFromAuthButtonImg() {
        return activeBackFromAuthButtonImg;
    }

    public static BufferedImage getPressedBackFromAuthButtonImg() {
        return pressedBackFromAuthButtonImg;
    }

    public static BufferedImage getGuestButtonImg() {
        return guestButtonImg;
    }

    public static BufferedImage getActiveGuestButtonImg() {
        return activeGuestButtonImg;
    }

    public static BufferedImage getPressedGuestButtonImg() {
        return pressedGuestButtonImg;
    }

    public static BufferedImage getExitGuestModeButtonImg() {
        return exitGuestModeButtonImg;
    }

    public static BufferedImage getActiveExitGuestModeButtonImg() {
        return activeExitGuestModeButtonImg;
    }

    public static BufferedImage getPressedExitGuestModeButtonImg() {
        return pressedExitGuestModeButtonImg;
    }

    public static BufferedImage getAuthPanelImg() {
        return authPanelImg;
    }

    public static BufferedImage getRegPanelImg() {
        return regPanelImg;
    }

    public static BufferedImage getBlockPanelImg() {
        return blockPanelImg;
    }

    public static BufferedImage getBlockForGuestPanelImg() {
        return blockForGuestPanelImg;
    }

    public static BufferedImage getGuestWarningPanelImg() {
        return guestWarningPanelImg;
    }

    public static BufferedImage getWarningExitGuestModePanelImg() {
        return warningExitGuestModePanelImg;
    }

    public static BufferedImage getGuestNoButtonImg() {
        return guestNoButtonImg;
    }

    public static BufferedImage getActiveGuestNoButtonImg() {
        return activeGuestNoButtonImg;
    }

    public static BufferedImage getPressedGuestNoButtonImg() {
        return pressedGuestNoButtonImg;
    }

    public static BufferedImage getGuestYesButtonImg() {
        return guestYesButtonImg;
    }

    public static BufferedImage getActiveGuestYesButtonImg() {
        return activeGuestYesButtonImg;
    }

    public static BufferedImage getPressedGuestYesButtonImg() {
        return pressedGuestYesButtonImg;
    }

    public static BufferedImage getFormFieldImg() {
        return formFieldImg;
    }

    // store panel buttons

    public static BufferedImage getSettingsButtonImg() {
        return settingsButtonImg;
    }

    public static BufferedImage getActiveSettingsButtonImg() {
        return activeSettingsButtonImg;
    }

    public static BufferedImage getPressedSettingsButtonImg() {
        return pressedSettingsButtonImg;
    }

    public static BufferedImage getLeftArrowButtonImg() {
        return leftArrowButtonImg;
    }

    public static BufferedImage getActiveLeftArrowButtonImg() {
        return activeLeftArrowButtonImg;
    }

    public static BufferedImage getPressedLeftArrowButtonImg() {
        return pressedLeftArrowButtonImg;
    }

    public static BufferedImage getRightArrowButtonImg() {
        return rightArrowButtonImg;
    }

    public static BufferedImage getActiveRightArrowButtonImg() {
        return activeRightArrowButtonImg;
    }

    public static BufferedImage getPressedRightArrowButtonImg() {
        return pressedRightArrowButtonImg;
    }

    public static BufferedImage getCloseProductInfoButtonImg() {
        return closeProductInfoButtonImg;
    }

    public static BufferedImage getActiveCloseProductInfoButtonImg() {
        return activeCloseProductInfoButtonImg;
    }

    public static BufferedImage getPressedCloseProductInfoButtonImg() {
        return pressedCloseProductInfoButtonImg;
    }

    // cart panel buttons

    public static BufferedImage getBuyButtonImg() {
        return buyButtonImg;
    }

    public static BufferedImage getActiveBuyButtonImg() {
        return activeBuyButtonImg;
    }

    public static BufferedImage getPressedBuyButtonImg() {
        return pressedBuyButtonImg;
    }

    public static BufferedImage getDropAllButtonImg() {
        return dropAllButtonImg;
    }

    public static BufferedImage getActiveDropAllButtonImg() {
        return activeDropAllButtonImg;
    }

    public static BufferedImage getPressedDropAllButtonImg() {
        return pressedDropAllButtonImg;
    }


    // item panel buttons

    public static BufferedImage getProductInfoButtonImg() {
        return productInfoButtonImg;
    }

    public static BufferedImage getActiveProductInfoButtonImg() {
        return activeProductInfoButtonImg;
    }

    public static BufferedImage getPressedProductInfoButtonImg() {
        return pressedProductInfoButtonImg;
    }

    public static BufferedImage getAddButtonImg() {
        return addButtonImg;
    }

    public static BufferedImage getActiveAddButtonImg() {
        return activeAddButtonImg;
    }

    public static BufferedImage getPressedAddButtonImg() {
        return pressedAddButtonImg;
    }

    public static BufferedImage getDropButtonImg() {
        return dropButtonImg;
    }

    public static BufferedImage getActiveDropButtonImg() {
        return activeDropButtonImg;
    }

    public static BufferedImage getPressedDropButtonImg() {
        return pressedDropButtonImg;
    }

    // search panel buttons

    public static BufferedImage getSearchButtonImg() {
        return searchButtonImg;
    }

    public static BufferedImage getActiveSearchButtonImg() {
        return activeSearchButtonImg;
    }

    public static BufferedImage getPressedSearchButtonImg() {
        return pressedSearchButtonImg;
    }

    public static BufferedImage getSearchOptionsButtonImg() {
        return searchOptionsButtonImg;
    }

    public static BufferedImage getActiveSearchOptionsButtonImg() {
        return activeSearchOptionsButtonImg;
    }

    public static BufferedImage getPressedSearchOptionsButtonImg() {
        return pressedSearchOptionsButtonImg;
    }

    public static BufferedImage getAuthorSearchLabelImg() {
        return authorSearchLabelImg;
    }

    public static BufferedImage getBookSearchLabelImg() {
        return bookSearchLabelImg;
    }

    public static BufferedImage getGenreSearchLabelImg() {
        return genreSearchLabelImg;
    }

    public static BufferedImage getIdSearchLabelImg() {
        return idSearchLabelImg;
    }

    public static BufferedImage getAllSearchLabelImg() {
        return allSearchLabelImg;
    }

    public static BufferedImage getSearchFieldPanelImg() {
        return searchFieldPanelImg;
    }

    // search options panel

    public static BufferedImage getSearchOptionsPanelImg() {
        return searchOptionsPanelImg;
    }

    public static BufferedImage getBookButtonImg() {
        return bookButtonImg;
    }

    public static BufferedImage getActiveBookButtonImg() {
        return activeBookButtonImg;
    }

    public static BufferedImage getPressedBookButtonImg() {
        return pressedBookButtonImg;
    }

    public static BufferedImage getAuthorButtonImg() {
        return authorButtonImg;
    }

    public static BufferedImage getActiveAuthorButtonImg() {
        return activeAuthorButtonImg;
    }

    public static BufferedImage getPressedAuthorButtonImg() {
        return pressedAuthorButtonImg;
    }

    public static BufferedImage getGenreButtonImg() {
        return genreButtonImg;
    }

    public static BufferedImage getActiveGenreButtonImg() {
        return activeGenreButtonImg;
    }

    public static BufferedImage getPressedGenreButtonImg() {
        return pressedGenreButtonImg;
    }

    public static BufferedImage getIdButtonImg() {
        return idButtonImg;
    }

    public static BufferedImage getActiveIdButtonImg() {
        return activeIdButtonImg;
    }

    public static BufferedImage getPressedIdButtonImg() {
        return pressedIdButtonImg;
    }

    public static BufferedImage getAllButtonImg() {
        return allButtonImg;
    }

    public static BufferedImage getActiveAllButtonImg() {
        return activeAllButtonImg;
    }

    public static BufferedImage getPressedAllButtonImg() {
        return pressedAllButtonImg;
    }

    // numbers

    public static BufferedImage getOne() {
        return one;
    }

    public static BufferedImage getTwo() {
        return two;
    }

    public static BufferedImage getThree() {
        return three;
    }

    public static BufferedImage getFour() {
        return four;
    }

    public static BufferedImage getFive() {
        return five;
    }

    public static BufferedImage getSix() {
        return six;
    }

    public static BufferedImage getSeven() {
        return seven;
    }

    public static BufferedImage getEight() {
        return eight;
    }

    public static BufferedImage getNine() {
        return nine;
    }

    public static BufferedImage getZero() {
        return zero;
    }

    // alphabet
    // up

    public static BufferedImage getAImg() {
        return AImg;
    }

    public static BufferedImage getBImg() {
        return BImg;
    }

    public static BufferedImage getCImg() {
        return CImg;
    }

    public static BufferedImage getDImg() {
        return DImg;
    }

    public static BufferedImage getEImg() {
        return EImg;
    }

    public static BufferedImage getFImg() {
        return FImg;
    }

    public static BufferedImage getGImg() {
        return GImg;
    }

    public static BufferedImage getHImg() {
        return HImg;
    }

    public static BufferedImage getIImg() {
        return IImg;
    }

    public static BufferedImage getJImg() {
        return JImg;
    }

    public static BufferedImage getKImg() {
        return KImg;
    }

    public static BufferedImage getLImg() {
        return LImg;
    }

    public static BufferedImage getMImg() {
        return MImg;
    }

    public static BufferedImage getNImg() {
        return NImg;
    }

    public static BufferedImage getOImg() {
        return OImg;
    }

    public static BufferedImage getPImg() {
        return PImg;
    }

    public static BufferedImage getQImg() {
        return QImg;
    }

    public static BufferedImage getRImg() {
        return RImg;
    }

    public static BufferedImage getSImg() {
        return SImg;
    }

    public static BufferedImage getTImg() {
        return TImg;
    }

    public static BufferedImage getUImg() {
        return UImg;
    }

    public static BufferedImage getVImg() {
        return VImg;
    }

    public static BufferedImage getWImg() {
        return WImg;
    }

    public static BufferedImage getXImg() {
        return XImg;
    }

    public static BufferedImage getYImg() {
        return YImg;
    }

    public static BufferedImage getZImg() {
        return ZImg;
    }


    // low

    public static BufferedImage getaImg() {
        return aImg;
    }

    public static BufferedImage getbImg() {
        return bImg;
    }

    public static BufferedImage getcImg() {
        return cImg;
    }

    public static BufferedImage getdImg() {
        return dImg;
    }

    public static BufferedImage geteImg() {
        return eImg;
    }

    public static BufferedImage getfImg() {
        return fImg;
    }

    public static BufferedImage getgImg() {
        return gImg;
    }

    public static BufferedImage gethImg() {
        return hImg;
    }

    public static BufferedImage getiImg() {
        return iImg;
    }

    public static BufferedImage getjImg() {
        return jImg;
    }

    public static BufferedImage getkImg() {
        return kImg;
    }

    public static BufferedImage getlImg() {
        return lImg;
    }

    public static BufferedImage getmImg() {
        return mImg;
    }

    public static BufferedImage getnImg() {
        return nImg;
    }

    public static BufferedImage getoImg() {
        return oImg;
    }

    public static BufferedImage getpImg() {
        return pImg;
    }

    public static BufferedImage getqImg() {
        return qImg;
    }

    public static BufferedImage getrImg() {
        return rImg;
    }

    public static BufferedImage getsImg() {
        return sImg;
    }

    public static BufferedImage gettImg() {
        return tImg;
    }

    public static BufferedImage getuImg() {
        return uImg;
    }

    public static BufferedImage getvImg() {
        return vImg;
    }

    public static BufferedImage getwImg() {
        return wImg;
    }

    public static BufferedImage getxImg() {
        return xImg;
    }

    public static BufferedImage getyImg() {
        return yImg;
    }

    public static BufferedImage getzImg() {
        return zImg;
    }

    // symbols

    public static BufferedImage getPointImg() {
        return pointImg;
    }

    public static BufferedImage getSpaceImg() {
        return spaceImg;
    }
}
